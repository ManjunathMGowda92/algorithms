package org.manjunath.sorting.selectionsort;

/**
 * Class <i>CharacterSelectionSort</i> follows the Linear Sort Algorithm to sort
 * the array of Characters.
 * 
 * <p>
 * For Example: <blockquote>
 * 
 * <pre>
 * input Array : {'c', 'a', 'e', 'k', 'y', 'd', 's'}
 * 
 * Then after sorting the output array is : {'a', 'c', 'd', 'e', 'k', 's', 'y'}
 * </pre>
 * 
 * </blockquote>
 * </p>
 * 
 * @author Manjunath HM
 *
 */
public class CharacterSelectionSort {

	/**
	 * Method <i>selectionSort()</i> sorts the unsorted array into sorted array.
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
	 *            Unsorted Input Array
	 */
	private void selectionSort(char[] arr) {
		int n = arr.length;

		for (int i = 0; i < n - 1; i++) {
			char min = arr[i];

			for (int j = i + 1; j < n; j++) {
				if (arr[j] < min) {
					min = arr[j];

					char temp = arr[j];
					arr[j] = arr[i];
					arr[i] = temp;
				}
			}
		}
	}
	
	/**
	 * Method printArray is used to print the array.
	 * 
	 * @param array
	 *            Input Array
	 */
	private void printArray(char[] array) {
		System.out.print("{ ");
		for (int i = 0; i < array.length; i++) {
			if (i == array.length -1)
				System.out.print(array[i] + " }");
			else
				System.out.print(array[i] + ", ");
		}
		System.out.println();
	}

	/**
	 * Method <i> getSortedArray</i> just call the selectionSort method and returns
	 * the sorted array
	 * 
	 * @param arr
	 *            Unsorted array
	 * @return Sorted Array
	 */
	public char[] getSortedArray(char[] arr) {
		System.out.println("Array before Sorting: ");
		printArray(arr);
		
		selectionSort(arr);
		
		System.out.println("Array after Sorting: ");
		printArray(arr);

		return arr;
	}
}
