package org.manjunath.sorting.bubblesort;

/**
 * Class <i>IntegerBubbleSort</i> follows the Bubble Sort Algorithm to sort the
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
public class IntegerBubbleSort {
	/**
	 * Method <i> getSortedArray</i> just call the sort method {implemented
	 * bubble sort} and returns the sorted array
	 * 
	 * @param arr
	 *            Unsorted array
	 * @return Sorted Array
	 */
	public int[] getSortedArray(int[] array) {
		System.out.println("Array before Sorting: ");
		printArray(array);

		sort(array);

		System.out.println("Array after Sorting: ");
		printArray(array);
		
		return array;
	}

	/**
	 * Method <i> sort </i>, sorts the elements of array. The sorting is
	 * implemented by bubble sort. In Bubble sort for each iteration the
	 * greatest element in the array will bubbles to the right side of array and
	 * occupies the proper position
	 * 
	 * @param array
	 *            Input array for sorting
	 */
	private void sort(int[] array) {

		/*
		 * Fix the sorted and unsorted arrays in the given array. Left part of
		 * array will be unsorted and right part of array is sorted. For each
		 * iteration of outer loop greatest element will be placed to right part
		 * of array in correct position. And in next iteration the sorted array
		 * (right part) will not be touched
		 */

		// make the last index as unsortedIndex and loop through the elements
		// till the unsortedIndex comes to front of the array.
		for (int lastUnsortedIndex = array.length - 1; lastUnsortedIndex > 0; lastUnsortedIndex--) {

			// from 0th index to unsorted index compare the ith and (i+1)th
			// element. If ith element is greater then swap them
			for (int i = 0; i < lastUnsortedIndex; i++) {
				if (array[i] > array[i + 1]) {
					swap(array, i, i + 1);
				}
			}
		}
	}

	/**
	 * Method <i> swap </i> is used to swap the array elements between i and jth
	 * positions
	 * 
	 * @param array
	 *            Input array
	 * @param i
	 *            First position of element to be swapped
	 * @param j
	 *            Second position of element to be swapped
	 */
	private void swap(int[] array, int i, int j) {
		if (i == j)
			return;

		int temp = array[i];
		array[i] = array[j];
		array[j] = temp;
	}

	/**
	 * Method <i> printArray </i> is used to print the array elements
	 * 
	 * @param array
	 */
	private void printArray(int[] array) {
		System.out.println();
		System.out.print("{ ");
		for (int i = 0; i < array.length; i++) {
			if (i == array.length - 1)
				System.out.print(array[i] + " }");
			else
				System.out.print(array[i] + ", ");
		}
		System.out.println();
	}
}
