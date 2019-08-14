package org.manjunath.linearsearch;

public class IntegerLinerSearch {

	/**
	 * Method linearSearch() searches for the provided key in array in linear
	 * order. If search is successful it returns the index of element in array
	 * else returns -1
	 * 
	 * @param arr
	 *            Integer Array on search need to be done.
	 * @param key
	 *            Integer element that need to be searched in array
	 * @return if successful returns index of element in array else -1
	 */
	public int linearSearch(int[] arr, int key) {

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == key)
				return i;
		}

		return -1;
	}
}
