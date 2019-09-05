package org.manjunath.sorting.selectionsort;

/**
 * Class <i>IntegerLinearSort</i> follows the Linear Sort Algorithm to sort the
 * array of Integers.
 * 
 * <p>
 * For Example: <blockquote>
 * 
 * <pre>
 * input Array : {5, 8, 2, 9, 1, 0, 6}
 * 
 * Then after sorting the output array is : {0, 1, 2, 5, 6, 8, 9}
 * </pre>
 * 
 * </blockquote>
 * </p>
 * 
 * @author Manjunath HM
 *
 */
public class IntegerSelectionSort {

	/**
	 * Method <i>linearSort()</i> sorts the unsorted into sorted array.
	 * <p>
	 * Linear sort algorithm sorts an array by repeatedly finding the minimum
	 * element. In each iteration the lowest element of array sorts into the
	 * respective index of array where the element can be placed after sorting
	 * </p>
	 * 
	 * <p>
	 * It follows the 2 level of iteration to sort the array. In each iteration
	 * the ith element from the first loop will be compared with the other
	 * elements and min value will be placed to proper index of array
	 * </p>
	 * 
	 * @param arr
	 */
	private void linearSort(int[] arr) {

		int n = arr.length;

		for (int i = 0; i < n - 1; i++) {

			int min = arr[i];

			for (int j = i + 1; j < n; j++) {
				if (arr[j] < min) {
					min = arr[j];

					int temp = arr[j];
					arr[j] = arr[i];
					arr[i] = temp;
				}
			}
		}
	}

	/**
	 * Method <i> getSortedArray</i> just call the linearSort method and returns
	 * the sorted array
	 * 
	 * @param arr
	 *            Unsorted array
	 * @return Sorted Array
	 */
	public int[] getSortedArray(int[] arr) {
		linearSort(arr);

		return arr;
	}
}
