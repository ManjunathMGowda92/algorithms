package org.manjunath.sorting.bubblesort;

public class CharacterBubbleSort {
	
	public char[] getSortedArray(char[] array) {
		System.out.println("Array Before Sorting");
		printArray(array);
		
		sort(array);
		
		System.out.println("Array Before Sorting");
		printArray(array);
		
		return array;
	}
	
	private void printArray(char[] array) {
		System.out.print("{ ");
		for(int i = 0; i < array.length; i++) {
			if (i == array.length-1)
				System.out.print("'"+array[i] +"' }");
			else
				System.out.print("'"+array[i] +"', ");
		}
		System.out.println();
		System.out.println();
	}

	private void sort(char[] array) {
		for (int lastUnsortedIndex = array.length-1; lastUnsortedIndex > 0; lastUnsortedIndex--) {
			
			for (int i = 0; i< lastUnsortedIndex; i++) {
				if (array[i] > array[i+1]){
					swap(array, i , i+1);
				}
			}
		}
	}

	private void swap(char[] array, int i, int j) {
		if (i == j)
			return;
		
		char temp = array[i];
		array[i] = array[j];
		array[j] = temp;
	}
}
