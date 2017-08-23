
public class BubbleSort {

	public static void bubbleSort(int[] arr) {
		int size = arr.length;
		
		for(int i = 0; i < arr.length - 1; i++) {
			for(int j = 0; j < size - 1; j++) {
				if(arr[j] > arr[j+1]) {
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
			size--;
		}
		
	}
	
	public static void print(int[] arr){
		for(int i=0; i <= arr.length - 1; i++){
			System.out.print(arr[i] + " ");
		}
		System.out.println();
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] test1 = {8,21,7,13,18,3};
		int[] test2 = {19,8,27,61,5,23,1};
		int[] test3 = {1,2,3,4,5,6,7,8};
		int[] test4 = {};
		int[] test5 = {22,3,14,9,12,3,5,5,26,38,56,0,45,40};
		
		System.out.println("test 1:");
		bubbleSort(test1);
		print(test1);
		
		System.out.println("test 2:");
		bubbleSort(test2);
		print(test2);
		
		System.out.println("test 3:");
		bubbleSort(test3);
		print(test3);
		
		System.out.println("test 4:");
		bubbleSort(test4);
		print(test4);
		
		System.out.println("test 5:");
		bubbleSort(test5);
		print(test5);
	}

}
