package search;

public class LinearSearch {

	public static void main(String[] args) {
		int[] numbers = {8, 4, 3, 12, 1, 7, 9, 14};
		int index = linearSearch(numbers, 9);
		if(index !=-1)
			System.out.println("Number is found at index: "+index);
		else
			System.out.println("Number is Not found...");
	}
	private static int linearSearch(int[] array, int key){
		int i = 0;
		for(; i < array.length; i++){
			if(key == array[i])
				break;	
		}
		if(i == array.length) // here the loop got exhausted 
			return -1;
		else
			return i;
	}

}
