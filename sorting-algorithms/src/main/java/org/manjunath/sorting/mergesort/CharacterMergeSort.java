package org.manjunath.sorting.mergesort;

/**
 * Class CharacterMergeSort is used to sort the character array. This class
 * follows the <b>Divide and Merge</b> algorithm.
 * 
 * @author Manjunath HM
 *
 */
public class CharacterMergeSort {

	/**
	 * Function merge() is used merge the left and right sub arrays into the
	 * main array
	 * 
	 * @param main
	 *            Main array
	 * @param left
	 *            Left Array
	 * @param right
	 *            Right Array
	 */
	private void merge(char[] main, char[] left, char[] right) {
		// get 3 integer local variables and assign them to value zero
		int i = 0, j = 0, k = 0;
		// get the length of left array
		int leftLength = left.length;
		// get the length of right array
		int rightLength = right.length;

		// As long as the variable i is less than leftLength and j less than
		// rightLength execute the loop
		while (i < leftLength && j < rightLength) {

			// if the left array element is less than the right array element
			// then replace the main array kth index element with left array
			// element else do the reverse.
			if (left[i] < right[j]) {
				main[k] = left[i];
				i++;
			} else {
				main[k] = right[j];
				j++;
			}
			k++;
		}

		// add the remaining elements from the left array to main array
		while (i < leftLength) {
			main[k] = left[i];
			i++;
			k++;
		}

		// add the remaining elements from the right array to the main array
		while (j < rightLength) {
			main[k] = right[j];
			k++;
			j++;
		}
	}

	/**
	 * Method mergeSort() sorts the given character input array by using the
	 * divide and merge concept. First the methods divides the complete array
	 * into small chunks and then it merges into the main array
	 * 
	 * @param arr
	 *            Unsorted Character array
	 */
	public void mergeSort(char[] arr) {
		// if the array is null then return.
		if (arr == null)
			return;

		// if the array length is greater than 1 then continue to divide and
		// merge
		if (arr.length > 1) {

			// get the mid index for the array
			int mid = arr.length / 2;

			// Create 2 new arrays as left and right using the mid index
			// left array is having the length of mid
			char[] left = new char[mid];

			// right array with length-mid
			char[] right = new char[arr.length - mid];

			// assign the elements to left array from the main array
			for (int i = 0; i < mid; i++)
				left[i] = arr[i];

			// assign the elements to right array from the main array
			for (int i = mid; i < arr.length; i++)
				right[i - mid] = arr[i];

			// apply merge sort for left array
			mergeSort(left);
			// apply merge sort for right array
			mergeSort(right);

			// Call merge function using main array, left array and right array
			merge(arr, left, right);
		}
	}

	public char[] getSortedArray(char[] arr) {
		mergeSort(arr);

		return arr;
	}
}
