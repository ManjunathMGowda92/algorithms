package org.manjunath.sorting.quicksort;

public class CharacterQuickSort {
	private int getPartitionIndex(char[] arr, int start, int end) {
		int partitionIndex = start;
		char pivot = arr[end];

		for (int i = start; i < end; i++) {
			if (arr[i] < pivot) {
				char temp = arr[i];
				arr[i] = arr[partitionIndex];
				arr[partitionIndex] = temp;

				partitionIndex++;
			}
		}

		char temp = arr[partitionIndex];
		arr[partitionIndex] = arr[end];
		arr[end] = temp;

		return partitionIndex;
	}

	public void quickSort(char[] arr, int start, int end) {
		if (start > end)
			return;

		if (start <= end) {
			int partitionIndex = getPartitionIndex(arr, start, end);
			quickSort(arr, start, partitionIndex - 1);
			quickSort(arr, partitionIndex + 1, end);
		}
	}
	
	public char[] getSortedArray(char[] arr) {
		quickSort(arr, 0, arr.length-1);
		
		return arr;
	}
}
