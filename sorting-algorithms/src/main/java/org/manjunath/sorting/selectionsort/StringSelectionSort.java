package org.manjunath.sorting.selectionsort;

/**
 * Class <i>StringSelectionSort</i> follows the Linear Sort Algorithm to sort
 * the array of Strings.
 * 
 * <p>
 * For Example: <blockquote>
 * 
 * <pre>
 * input Array : {"raju", "ravi", "ranga", "rama", "rajesh", "reddy"}
 * 
 * Then after sorting, the output array is : {"rajesh", "raju", "rama", "ranga", "ravi", "reddy"}
 * </pre>
 * 
 * </blockquote>
 * </p>
 * 
 * @author Manjunath HM
 *
 */
public class StringSelectionSort {

	/**
	 * Method <i>selectionSort()</i> sorts the unsorted array into sorted array.
	 * <p>
	 * Selection sort algorithm sorts an array by repeatedly finding the minimum
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
	 *            Unsorted Input Array
	 */
	private void selectionSort(String[] arr) {
		int n = arr.length;

		for (int i = 0; i < n - 1; i++) {
			String min = arr[i];

			for (int j = i + 1; j < n; j++) {
				if (arr[j].compareTo(min) < 0) {
					min = arr[j];

					String temp = arr[j];
					arr[j] = arr[i];
					arr[i] = temp;
				}
			}
		}
	}
	
	/**
	 * Method <i> getSortedArray</i> just call the selectionSort method and returns
	 * the sorted array
	 * 
	 * @param arr
	 *            Unsorted array
	 * @return Sorted Array
	 */
	public String[] getSortedArray(String[] arr) {
		selectionSort(arr);

		return arr;
	}
}
