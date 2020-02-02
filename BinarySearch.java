package search; 

import java.util.Arrays;
import sort.QuickSort;

public class BinarySearch {

	public static void main(String[] args) {
		int[] numbers = {8, 14, 1, 9, 3, 24, 15, 5, 10, 2, 7, 19};
		QuickSort.quickSort(numbers, 0, numbers.length-1); 
		System.out.println(Arrays.toString(numbers)+"\n");
		
		int index = BinarySearchIterative(numbers, 10);
		if(index!=-1)
			System.out.println("Iterative >>> Number found at index: "+index);
		else
			System.out.println("Iterative >>> Number not found...");
		
		int i = BinarySearchRecursive(numbers, 7, 0, numbers.length-1);
		if(i!=-1)
			System.out.println("Recursive >>> Number found at index: "+i);
		else
			System.out.println("Recursive >>> Number not found...");

	}

	private static int BinarySearchIterative(int[] array, int key){
		int low, high, mid;
		low = 0;
		high = array.length-1;
		
		while(low <= high){
			mid = (low + high)/2;
			if(key == array[mid])
				return mid;
			else if(key < array[mid])
				high = mid - 1;
			else
				low = mid + 1;
		}
		// here it crossed the pivot/midpoint, item not found
		return -1;
		
	}
	
	private static int BinarySearchRecursive(int[] array, int key, int low, int high){
		if(low == high){
			if(key == array[low])
				return low;
			else
				return -1;
		}else{
			int mid = (low + high)/2;
			if(key == array[mid]){
				return mid;
			}
			else if(key < array[mid]){
				high = mid -1;
				return BinarySearchRecursive(array, key, low, high);
			}else{
				low = mid + 1;
				return BinarySearchRecursive(array, key, low, high);
			}
		}
	}
}
