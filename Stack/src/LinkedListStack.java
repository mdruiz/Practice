import java.util.LinkedList;


//Stack implemented with LinkedList
public class LinkedListStack<T> {
	private Node head;
	
	private class Node{
		private T value;
		private Node next;
		
		//Constructor
		public Node(T value, Node next) {
			this.value = value;
			this.next = next;
		}
		
	}
	
	//pushes an element to top of the stack
	public void push(T data) {
		Node newNode = new Node(data, head);
		head = newNode;
	}
	
	//removes and returns element at the top of the stack
	public T pop() {
		if(head == null) {
			System.out.println("Stack is Empty!");
			return null;
		}
		Node oldHead = head;
		head = head.next;
		return oldHead.value;
	}
	
	//returns element at the top of the stack without removing it
	public T peek() {
		if(head == null) {
			System.out.println("Stack is Empty!");
			return null;
		}
		return head.value;
	}
	
	//returns true if stack is empty
	public boolean isEmpty() {
		if(head == null) {
			return true;
		}
		else {
			return false;
		}
	}
	
}
