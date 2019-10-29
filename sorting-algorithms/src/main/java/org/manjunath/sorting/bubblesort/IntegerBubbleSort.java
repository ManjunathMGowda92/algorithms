package org.manjunath.sorting.bubblesort;

public class IntegerBubbleSort {
	
	public void getSortedArray(int[] array) {
		System.out.println("Array before Sorting: ");
		printArray(array);
		
		sort(array);
		
		System.out.println("Array after Sorting: ");
		printArray(array);
	}
	private void sort(int[] array) {

		for (int lastUnsortedIndex = array.length - 1; lastUnsortedIndex > 0; lastUnsortedIndex--) {
			for (int i = 0; i < lastUnsortedIndex; i++) {
				if (array[i] > array[i + 1]) {
					swap(array, i, i + 1);
				}
			}
		}
	}

	private void swap(int[] array, int i, int j) {
		if (i == j)
			return;

		int temp = array[i];
		array[i] = array[j];
		array[j] = temp;
	}

	private void printArray(int[] array) {
		System.out.print("{ ");
		for (int i = 0; i < array.length; i++) {
			if (i == array.length - 1)
				System.out.print(array[i] + " }");
			else
				System.out.print(array[i] + ", ");
		}
		System.out.println();
	}
}
