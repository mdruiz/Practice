import java.util.ArrayList;
import java.util.List;

//Stack implemented with array
public class ArrrayStack <T> {
	private int size;	//size of stack
	private T[] stack;	//array containing stack's data
	private int index;  // index of top of stack
	
	//constructor
	public ArrrayStack(int size){
		this.size = size;
		stack = (T[]) new Object[size];
		index = -1;
	}
	
	//pushes an element to top of the stack
	public void push(T data) {
		if(index == size - 1) {
			System.out.println("Stack at Capacity!");
			return;
		}
		index++;
		stack[index] = data;
	}
	
	//removes and returns element at the top of the stack
	public T pop() {
		if(index == -1) {
			System.out.println("Stack is Empty!");
			return null;
		}
		T top = stack[index];
		stack[index] = null;
		index--;
		return top;
	}
	
	//returns element at the top of the stack without removing it
	public T peek() {
		if(index == -1) {
			System.out.println("Stack is Empty!");
			return null;
		}
		return stack[index];
	}
	
	//returns true if stack is empty
	public boolean isEmpty() {
		if(index == -1) {
			return true;
		}
		else {
			return false;
		}
	}
	
}