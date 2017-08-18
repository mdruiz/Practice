
public class HeapSort {

	public static void main(String[] args) {
		int[] test1 = {8,21,7,13,18,3};
		int[] test2 = {19,8,27,61,5,23,1};
		int[] test3 = {1,2,3,4,5,6,7,8};
		int[] test4 = {};
		int[] test5 = {22,3,14,9,12,3,5,5,26,38,56,0,45,40};
		
		System.out.println("test 1:");
		heapSort(test1);
		print(test1);
		
		System.out.println("test 2:");
		heapSort(test2);
		print(test2);
		
		System.out.println("test 3:");
		heapSort(test3);
		print(test3);
		
		System.out.println("test 4:");
		heapSort(test4);
		print(test4);
		
		System.out.println("test 5:");
		heapSort(test5);
		print(test5);
	
	}
	
	public static void heapSort(int[] arr) {
		buildMaxHeap(arr,arr.length);
		
		int temp;
		for(int i = arr.length - 1; i > 0 ; i--) {
			//swapping root and last node
			temp = arr[0];
			arr[0] = arr[i];
			arr[i] = temp;
			//putting new root in correct position (trickleDown)
			maxHeapify(arr,i,0);
		}
		
	}

	public static void buildMaxHeap(int[] arr, int heapSize) {
		//starting from last parent and working upward towards root
		for (int i = (heapSize - 1)/2;i >= 0; i--) {
			maxHeapify(arr,heapSize,i);
		}
	}
	
	public static void maxHeapify(int[] arr, int heapSize, int index) {
		int parent = index;
		int leftChild = 2*index + 1;
		int rightChild = 2*index + 2;
		
		//while parent node breaks MaxHeap properties
		while((leftChild < heapSize && arr[leftChild] > arr[parent]) || (rightChild < heapSize && arr[rightChild] > arr[parent] ) ) {
			//if parent has two children
			if(rightChild < heapSize) {
				//swap parent with max among children
				if (arr[leftChild] > arr[rightChild]) {
					int temp = arr[leftChild];
					arr[leftChild] = arr[parent];
					arr[parent] = temp;
					parent = leftChild;
				}
				else {
					int temp = arr[rightChild];
					arr[rightChild] = arr[parent];
					arr[parent] = temp;
					parent = rightChild;
				}
			}
			//if parent has only one child
			else {
				int temp = arr[leftChild];
				arr[leftChild] = arr[parent];
				arr[parent] = temp;
				parent = leftChild;
			}
			//update children
			leftChild = 2*parent + 1;
			rightChild = 2*parent + 2;
		}
		
	}
	
	public static void print(int[] arr){
		for(int i=0; i <= arr.length - 1; i++){
			System.out.print(arr[i] + " ");
		}
		System.out.println();
		
	}
	
	
}
