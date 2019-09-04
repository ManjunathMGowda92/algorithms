package org.manjunath.sorting.quicksort;

public class IntegerQuickSort {
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
	private int getPartitionIndex(int[] arr, int start, int end) {
		// Assign the partitionIndex with start index
		int partitionIndex = start;

		// pivot element will be the end index element of array
		int pivot = arr[end];

		// loop the array from the start to end index
		for (int i = start; i < end; i++) {
			// if the arr[i] element is less than the pivot element, then swap
			// the arr[i] element with the arr[partitionIndex], and increase the
			// partitionIndex value
			if (arr[i] < pivot) {
				int temp = arr[i];
				arr[i] = arr[partitionIndex];
				arr[partitionIndex] = temp;

				partitionIndex++;
			}
		}

		// after looping the partitionIndex will be available. So swap the
		// arr[partitionIndex] element with the end element(i.e pivot element)
		int temp = arr[partitionIndex];
		arr[partitionIndex] = arr[end];
		arr[end] = temp;

		// return the partitionIndex obtained
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
	public void quickSort(int[] arr, int start, int end) {
		// if the start index is greater than the end index, then return
		if (start > end)
			return;

		// if start index is less than or equal to the end index, then do the
		// following steps
		// 1. get the partition index for the array
		// 2. call the quickSort method for array from start to partitionIndex-1
		// 3. call the quickSort method for array from partitionIndex+1 to end
		if (start <= end) {
			int partitionIndex = getPartitionIndex(arr, start, end);
			quickSort(arr, start, partitionIndex - 1);
			quickSort(arr, partitionIndex + 1, end);
		}
	}

	/**
	 * Method getSortedArray() accepts an unsorted integer array and returns the
	 * sorted array. It just calls the quickSort method and after that returns
	 * the sorted array
	 * 
	 * @param arr
	 *            Input unsorted Array
	 * @return Sorted Array
	 */
	public int[] getSortedArray(int[] arr) {
		quickSort(arr, 0, arr.length - 1);

		return arr;
	}
}
