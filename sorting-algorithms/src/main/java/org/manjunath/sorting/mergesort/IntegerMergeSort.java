package org.manjunath.sorting.mergesort;

public class IntegerMergeSort {

	private void merge(int[] main, int[] left, int[] right) {
		int i = 0, j = 0, k = 0;
		int leftlength = left.length;
		int rightlength = right.length;

		// As long as i less than left array length and j less than right array
		// length, do the iteration
		while (i < leftlength && j < rightlength) {

			// if the i-th element of left array is less than j-th element of
			// right array, replace the main array element with the left array
			// element
			if (left[i] < right[j]) {
				main[k] = left[i];
				i++;
			} else {
				// assign the right array element to main array if it doen't
				// satisfies the above condition
				main[k] = right[j];
				j++;
			}

			k++;
		}

		// add the remaining left elements from left array into the main array
		while (i < leftlength) {
			main[k] = left[i];
			i++;
			k++;
		}

		// add the remaining left elements from right array into the main array
		while (j < rightlength) {
			main[k] = right[j];
			j++;
			k++;
		}
	}

	/**
	 * Method mergeSort accepts an unsorted array and converts into sorted
	 * format. This method follows the Divide and Conquer algorithmic paradigm
	 * to solve the problem
	 * 
	 * @param main
	 */
	public void mergeSort(int[] main) {
		// if the input array is null, then return
		if (main == null)
			return;

		// if the length of array is greater than 1, then only recursively do
		// process on the array
		if (main.length > 1) {
			// get mid index of the array
			int mid = main.length / 2;

			// Split the main array into left and right arrays by using mid
			// index
			int[] left = new int[mid];
			int[] right = new int[main.length - mid];

			// assign the main array values into left and right arrays
			for (int i = 0; i < mid; i++)
				left[i] = main[i];

			for (int i = mid; i < main.length; i++)
				right[i - mid] = main[i];

			// call mergeSort on the left and right array
			mergeSort(left);
			mergeSort(right);

			// merge the left and right arrays into main array
			merge(main, left, right);
		}
	}

	/**
	 * Method getSortedArray() accepts an unsorted integer array and then return
	 * back the sorted array
	 * 
	 * @param arr
	 *            Integer Array which is unsorted
	 * @return Array in sorted format
	 */
	public int[] getSortedArray(int[] arr) {
		mergeSort(arr);

		return arr;
	}
}
