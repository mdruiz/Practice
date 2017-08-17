
public class MyLinkedList <T> {
	private Node head;
	
	private class Node{
		private T value;
		private Node next;
		
		// Constructor
		public Node(T value, Node next) {
			this.setValue(value);
			this.setNext(next);
		}
		
		// Accessor methods
		public T getValue() {
			return this.value;
		}
		public Node getNext() {
			return this.next;
		}
		
		// Modifier methods
		public void setValue(T value) {
			this.value = value;
		}
		public void setNext(Node next) {
			this.next = next;
		}
		
	}
	
	//Constructor
	public MyLinkedList() {
		this.head = null;
	}
	
	
	//returns size of list
	public int size() {
		int count = 0;
		Node currNode = head;
		
		while(currNode != null) {
			count++;
			currNode = currNode.getNext();
		}
		return count;
	}
	
	//add element to the end of the list (head)
	public void add(T value) {
		Node newNode = new Node(value, head);
		head = newNode;
	}
	
	//add element at specified position, where head is position 0
	public void add(T value, int index) {
		//if adding to front of list
		if (index == 0) {
			add(value);
		}
		//if adding between two nodes or end
		else if (index > 0 && index <= this.size()) {
			Node tempNode = head;
			Node prevNode = null; //follows behind tempNode
			for(int i = 0; i < index; i++) {
				prevNode = tempNode;
				tempNode = tempNode.getNext();
			}
			Node newNode = new Node(value, tempNode);
			prevNode.setNext(newNode);
		}
		//if index is out of bounds
		else {
			System.out.println("Index Out of Bounds!");
		}
	}
	
	//add value to front of list (tail)
	public void addFront(T value) {
		Node newNode;
		Node tempNode = head;
		Node prevNode = null;
		
		while(tempNode != null) {
			prevNode = tempNode;
			tempNode = tempNode.getNext();
		}
		newNode = new Node(value,null);
		prevNode.setNext(newNode);
	}
	
	//clear everything from list
	public void clear() {
		head = null;
	}
	
	//returns element at index
	public T get(int index) {
		if (index < 0 || index >= this.size()) {
			return null;
		}
		Node tempNode = head;
		for(int i = 0; i < index; i++) {
			tempNode = tempNode.getNext();
		}
		return tempNode.getValue();
	}
	
	//removes and returns first element of list (head)
	public T removeFirst() {
		T value = head.getValue();
		head = head.getNext();
		return value;
	}
	
	//removes and returns last element in list (tail)
	public T removeLast() {
		if (head == null) {
			return null;
		}
		Node tempNode = head;
		Node prevNode = null;
		while (tempNode.getNext() != null) {
			prevNode = tempNode;
			tempNode = tempNode.getNext();
		}
		prevNode.setNext(null);
		return tempNode.getValue();
	}
	
	//removes and returns element at index
	public T remove( int index) {
		if (index < 0 || index >= this.size()) {
			return null;
		}
		Node tempNode = head;
		Node prevNode = null;
		for(int i = 0; i < index; i++) {
			prevNode = tempNode;
			tempNode = tempNode.getNext();
		}
		prevNode.setNext(tempNode.getNext());
		return tempNode.getValue();
	}
	
	// replaces the value at specified index
	public void set(int index, T value) {
		if (index < 0 || index >= this.size()) {
			return;
		}
		Node tempNode = head;
		for(int i = 0; i < index; i++) {
			tempNode = tempNode.getNext();
		}
		tempNode.setValue(value);
	}
	
	//prints list from head to tail
	public void print() {
		Node currNode = head;
		for(int i = 0; i < this.size() - 1; i++) {
			System.out.print(currNode.getValue() + ", ");
			currNode = currNode.getNext();
		}
		if (currNode != null) {
			System.out.println(currNode.getValue());
		}
	}
	
}
