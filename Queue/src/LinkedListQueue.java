
public class LinkedListQueue <T> {
	private Node head;
	private Node tail;
	
	private class Node {
		private T data;
		private Node next;
		private Node prev;
		
		//Constructor
		public Node(T data, Node next, Node prev) {
			this.data = data;
			this.next = next;
			this.prev = prev;
		}		
	}
	
	// push element into queue
	public void push(T data) {
		Node newNode = new Node(data,head,null);
		head = newNode;
		//if queue was empty before, newNode is both head and tail
		if(tail == null) {
			tail = newNode;
		}
		
	}
	
	//removes and returns element at top of queue
	public T pop() {
		if(head == null) {
			System.out.println("Queue is Empty!");
			return null;
		}
		//if only one element in Queue
		if(head == tail) {
			T oldTail = tail.data;
			head = null;
			tail = null;
			return oldTail;
		}
		else {
			T oldTail = tail.data;
			tail.prev.next = null;
			return oldTail;
		}
		
	}
	
	//returns element at front of Queue
	public T peek() {
		if(head == null) {
			System.out.println("Queue is Empty!");
			return null;
		}
		return tail.data;
	}
	
	//returns true if Queue is empty
	public boolean isEmpty() {
		if(head == null) {
			return true;
		}
		else {
			return false;
		}
	}
	
}
