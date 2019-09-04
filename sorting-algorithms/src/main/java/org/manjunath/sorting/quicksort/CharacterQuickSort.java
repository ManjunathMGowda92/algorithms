package org.manjunath.sorting.quicksort;

public class CharacterQuickSort {
	/**
	 * Method getPartitionIndex() method uses the given input array, start index
	 * and end index and helps in finding out the partitionIndex. This
	 * partitionIndex helps in further processing of the array for sorting
	 * 
	 * @param arr
	 *            Input Array
	 * @param start
	 *            Start index for the given array
	 * @param end
	 *            End Index for the given array
	 * @return Partition Index that helps in partitioning the array
	 */
	private int getPartitionIndex(char[] arr, int start, int end) {
		// initialize the partitionIndex with the start index
		int partitionIndex = start;

		// Get pivot element from the array. Pivot element is arr[end] element
		char pivot = arr[end];

		// loop the array from the start to end index
		for (int i = start; i < end; i++) {
			// if the arr[i] element is less than the pivot element, then swap
			// the arr[i] element with the arr[partitionIndex], and increase the
			// partitionIndex value
			if (arr[i] < pivot) {
				char temp = arr[i];
				arr[i] = arr[partitionIndex];
				arr[partitionIndex] = temp;

				partitionIndex++;
			}
		}

		// after looping swap the pivot element (i.e arr[end]) with the
		// arr[partitionIndex] element
		char temp = arr[partitionIndex];
		arr[partitionIndex] = arr[end];
		arr[end] = temp;

		// return the partitionIndex
		return partitionIndex;
	}

	/**
	 * Method quickSort() sorts the given input array. QuickSort divides array
	 * by using the partitionIndex. Partitioning the array and sorting each sub
	 * array will be done recursively
	 * 
	 * @param arr
	 *            Input Array for sorting
	 * @param start
	 *            Start index of the Array / sub array (For main array {first
	 *            time} is 0)
	 * @param end
	 *            End index of Array / Sub array ( For main array {first time}
	 *            is arrayLength -1)
	 */
	public void quickSort(char[] arr, int start, int end) {
		// if the start index is greater than the end index, then return
		if (start > end)
			return;

		// if the start index is less than or equal to the end index, then do
		// the following
		// 1. get partition index 
		// 2. call quick sort for array from start to partition-1 index
		// 3. call quick sort for array from partition+1 to end
		if (start <= end) {
			int partitionIndex = getPartitionIndex(arr, start, end);
			quickSort(arr, start, partitionIndex - 1);
			quickSort(arr, partitionIndex + 1, end);
		}
	}

	/**
	 * Method getSortedArray() accepts an unsorted character array and returns
	 * the sorted array. It just calls the quickSort method and after that
	 * returns the sorted array
	 * 
	 * @param arr
	 *            Input unsorted Array
	 * @return Sorted Array
	 */
	public char[] getSortedArray(char[] arr) {
		quickSort(arr, 0, arr.length - 1);

		return arr;
	}
}
