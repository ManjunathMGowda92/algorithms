package org.manjunath.sorting.mergesort;

public class StringMergeSort {

	private void merge(String[] main, String[] left, String[] right) {
		int i = 0, j = 0, k = 0;
		int leftLength = left.length;
		int rightLength = right.length;

		while (i < leftLength && j < rightLength) {
			if (left[i].compareTo(right[j]) < 0) {
				main[k] = left[i];
				i++;
			} else {
				main[k] = right[j];
				j++;
			}

			k++;
		}

		while (i < leftLength) {
			main[k] = left[i];
			i++;
			k++;
		}

		while (j < rightLength) {
			main[k] = right[j];
			j++;
			k++;
		}
	}
	
	public void mergeSort(String[] arr) {
		if (arr == null)
			return;
		
		if (arr.length > 1) {
			int mid = arr.length / 2;
			
			String[] left = new String[mid];
			String[] right = new String[arr.length - mid];
			
			for (int i = 0; i < mid; i++)
				left[i] = arr[i];
			
			for (int i = mid; i < arr.length; i++)
				right[i-mid] = arr[i];
			
			mergeSort(left);
			mergeSort(right);
			merge(arr, left, right);
		}
	}
}
