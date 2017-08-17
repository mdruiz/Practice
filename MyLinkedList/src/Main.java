
public class Main {

	public static void main(String[] args) {
		//testing with Integer type
		MyLinkedList<Integer> numList = new MyLinkedList<Integer>();
		
		//testing add methods
		numList.print(); //nothing
		numList.add(9);
		numList.add(21);
		numList.add(3);
		numList.print(); // [3,21,9]
		numList.addFront(14);
		numList.print(); // [3,21,9,14]
		numList.add(53,2);
		numList.print(); // [3,21,53,9,14]
		numList.add(7,0);
		numList.print(); // [7,3,21,53,9,14]
		numList.add(11, -2); //Index out of bounds
		numList.add(8,6);
		numList.print(); // [7,3,21,53,9,14,8]
		
		//testing set method
		numList.set(0, 18);
		numList.print(); // [18,3,21,53,9,14,8]
		numList.set(-2, 22);
		numList.print(); // [18,3,21,53,9,14,8]
		numList.set(6, 17);
		numList.print(); // [18,3,21,53,9,14,17]
		numList.set(7, 38);
		numList.print(); // [18,3,21,53,9,14,17]
		
		//test remove methods
		numList.remove(-1);
		numList.remove(7);
		numList.remove(3);
		numList.print(); // [18,3,21,9,14,17]
		numList.removeFirst();
		numList.print(); // [3,21,9,14,17]
		numList.removeLast();
		numList.print(); // [3,21,9,14]
		
		//testing get method
		System.out.println(numList.get(0)); //3 
		System.out.println(numList.get(3)); //14
		System.out.println(numList.get(4)); //null
		System.out.println(numList.get(2)); //9
		
		
	}

}
