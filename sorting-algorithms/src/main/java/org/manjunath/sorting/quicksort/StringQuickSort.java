package org.manjunath.sorting.quicksort;

public class StringQuickSort {

	/**
	 * Method getPartitionIndex() method used to get the partition index
	 * required for the array to do the partition. This method also sorts the
	 * elements in such a way that the elements which are to the left of pivot
	 * are less than the pivot and the elements which are to the right of the
	 * pivot are greater than the pivot element.
	 * 
	 * @param arr
	 *            Array that need to be sorted.
	 * @param start
	 *            Starting index of partitioned array
	 * @param end
	 *            End index of partitioned array
	 * @return PartitionIndex: Based on this index value further process will be
	 *         performed
	 */
	private int getPartitionIndex(String[] arr, int start, int end) {
		// initialize the partition index with start index
		int partitionIndex = start;

		// Pivot element should be the end index element of array
		String pivot = arr[end];

		// loop through the array from start to end index, to find the partition
		// index
		for (int i = start; i < end; i++) {
			// compare the ith element of array with the pivot element. If the
			// ith element is less than pivot then swap the ith element with the
			// partition index element (Comparision is done by using the
			// compareTo method of String)
			if (arr[i].compareTo(pivot) < 0) {
				String temp = arr[i];
				arr[i] = arr[partitionIndex];
				arr[partitionIndex] = temp;

				partitionIndex++;
			}
		}

		// Swap the partition index element with the pivot (i.e end index
		// element)
		String temp = arr[partitionIndex];
		arr[partitionIndex] = arr[end];
		arr[end] = temp;

		// return the partition index
		return partitionIndex;
	}

	/**
	 * Method quickSort() sorts the given unsorted array to sorted format.
	 * Sorting will be performed recursively to sort the array.
	 * <p>
	 * Sorting will be performed as follows
	 * <ol>
	 * <li>Get the partition index for the array</li>
	 * <li>Apply quick sort for the array from start to partitionIndex -1</li>
	 * <li>Apply quick sort for the array from partitionIndex +1 to end
	 * index</li>
	 * </ol>
	 * </p>
	 * 
	 * @param arr
	 *            Unsorted array
	 * @param start
	 *            Start index
	 * @param end
	 *            End Index
	 */
	public void quickSort(String[] arr, int start, int end) {
		// if start index is greater than the end index, then return
		if (start > end)
			return;

		// if start index is less than or equal to the end index, then do the
		// following things
		// 1. get the partition index
		// 2. apply quicksort for array from start to partition index -1
		// 3. apply quicksort for array from partition index + 1 to end
		if (start <= end) {
			int partitionIndex = getPartitionIndex(arr, start, end);
			quickSort(arr, start, partitionIndex - 1);
			quickSort(arr, partitionIndex + 1, end);
		}
	}

	public String[] getSortedArray(String[] arr) {
		quickSort(arr, 0, arr.length - 1);
		return arr;
	}
}
