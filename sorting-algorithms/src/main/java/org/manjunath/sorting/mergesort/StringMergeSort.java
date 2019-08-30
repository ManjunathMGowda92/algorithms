package org.manjunath.sorting.mergesort;

/**
 * Class StringMergeSort is used to sort the array of Strings. This class
 * follows the <b> Divide and Conquer </b> algorithm pattern.
 * 
 * @author Manjunath HM
 *
 */
public class StringMergeSort {

	/**
	 * Method merge(), merges the left and right sub arrays into the main array.
	 * 
	 * @param main
	 *            Main Array
	 * @param left
	 *            Left Array
	 * @param right
	 *            Right Array
	 */
	private void merge(String[] main, String[] left, String[] right) {
		// initialize 3 variables with zero, as these variables are indices for
		// the arrays
		int i = 0, j = 0, k = 0;

		// assign left array length into one variable
		int leftLength = left.length;
		// assign right array length into one variable
		int rightLength = right.length;

		// As long as the i is less than leftLength and j less than rightLength,
		// do the looping
		while (i < leftLength && j < rightLength) {
			// if the left array element is less than right array element, then
			// assign the main array kth index with left array element else do
			// the reverse

			// the string comparison will be done based on compareTo() method
			// of String class
			if (left[i].compareTo(right[j]) < 0) {
				main[k] = left[i];
				i++;
			} else {
				main[k] = right[j];
				j++;
			}

			k++;
		}

		// Assign remaining left array elements into main array
		while (i < leftLength) {
			main[k] = left[i];
			i++;
			k++;
		}

		// Assign remaining right array elements into main array
		while (j < rightLength) {
			main[k] = right[j];
			j++;
			k++;
		}
	}

	/**
	 * Method mergeSort() is used to sort the Array elements. MergeSort first
	 * divides the array into sub arrays as left and right and then it merges
	 * the sub arrays after sorting. This process will be performed recursively
	 * 
	 * @param arr
	 *            Array of String elements
	 */
	public void mergeSort(String[] arr) {
		// if array is null then return
		if (arr == null)
			return;

		// if array length is greater than 1, then continue the divide and merge
		// process
		if (arr.length > 1) {
			// get the mid index of array
			int mid = arr.length / 2;

			// Create 2 arrays as left and right by using the mid index. (Arrays
			// should be divided as equal parts by mid index)
			String[] left = new String[mid];
			String[] right = new String[arr.length - mid];

			// Assign the values to the left array from 0 to mid index
			for (int i = 0; i < mid; i++)
				left[i] = arr[i];

			// Assign the values to the right array from mid to array length
			for (int i = mid; i < arr.length; i++)
				right[i - mid] = arr[i];

			// Call mergeSort method for the left array
			mergeSort(left);
			// Call mergeSort method for the right array
			mergeSort(right);

			// Call merge method for main, left and right arrays
			merge(arr, left, right);
		}
	}

	public String[] getSortedArray(String[] arr) {
		mergeSort(arr);

		return arr;
	}
}
