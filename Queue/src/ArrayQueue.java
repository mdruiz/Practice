
public class ArrayQueue <T> {
	private int size;	//size of queue
	private T[] queue;	//array containing queue's data
	private int front;  //index of front of queue
	private int end; 	//index of end of queue
	private int currentSize; //current size of queue
	
	//Constructor
	public ArrayQueue(int size) {
		this.size = size;
		this.queue = (T[]) new Object[size];
		this.front = -1;
		this.end = -1;
		this.currentSize = 0;
	}
	
	// push element into queue
	public void push(T data) {
		if (currentSize == size) {
			System.out.println("Queue is Full!");
		}
		//if queue is empty
		if(currentSize == 0) {
			front++;
			end++;
			queue[end] = data;
			currentSize++;
		}
		else {
			end = (end + 1) % size; //if end++ == size, end = 0
			queue[end] = data;
			currentSize++;
		}
		
	}
	
	//removes and returns element at top of queue
	public T pop() {
		if(currentSize == 0) {
			System.out.println("Queue is Empty!");
			return null;
		}
		//if only one element in Queue
		if(currentSize == 1) {
			T temp = queue[front];
			front = -1;
			end = -1;
			currentSize--;
			return temp;
		}
		else {
			T temp = queue[front];
			front = (front + 1) % size; //if front++ == size, front = 0
			currentSize--;
			return temp;
		}
		
	}
	
	//returns element at front of Queue
	public T peek() {
		if(currentSize == 0) {
			System.out.println("Queue is Empty!");
			return null;
		}
		return queue[front];
	}
	
	//returns true if Queue is empty
	public boolean isEmpty() {
		if(currentSize == 0) {
			return true;
		}
		else {
			return false;
		}
	}
	
}
