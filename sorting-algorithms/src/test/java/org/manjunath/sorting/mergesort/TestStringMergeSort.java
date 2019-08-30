package org.manjunath.sorting.mergesort;

import org.manjunath.algorithms.testdocumentation.TestCase;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

/**
 * Class TestStringMergeSort is TestCase for the class StringMergeSort.
 *
 * @author Manjunath HM
 *
 */
public class TestStringMergeSort {
	private StringMergeSort sort;

	@BeforeTest
	public void doInitialization() {
		sort = new StringMergeSort();
	}

	@Test(testName = "testMergeSortForStringArray1", alwaysRun = true)
	@TestCase(Author = "Manjunath HM", testCaseDescription = "merge sort for the String array", expectedResult = "method should return the sorted array of Strings")
	public void testMergeSortForStringArray1() {
		Reporter.log("TestStringMergeSort: Strat of testMergeSortForStringArray1() method", true);

		try {
			String[] inputArr = { "def", "xyz", "aaa", "aab", "aac", "abc", "aba" };
			String[] expectedArr = { "aaa", "aab", "aac", "aba", "abc", "def", "xyz" };

			Assert.assertEquals(sort.getSortedArray(inputArr), expectedArr);
		} catch (AssertionError e) {
			Reporter.log("AssertionError occurred: " + e, true);
			Assert.assertTrue(false);
		} catch (Exception e) {
			Reporter.log("Exception occurred: " + e, true);
			Assert.assertTrue(false);
		}

		Reporter.log("TestStringMergeSort: End of testMergeSortForStringArray1() method", true);
	}

	@Test(testName = "testMergeSortForStringArray2", alwaysRun = true)
	@TestCase(Author = "Manjunath HM", testCaseDescription = "merge sort for the String array", expectedResult = "method should return the sorted array of Strings")
	public void testMergeSortForStringArray2() {
		Reporter.log("TestStringMergeSort: Strat of testMergeSortForStringArray2() method", true);

		try {
			String[] inputArr = { "Raju", "Arun", "Arjun", "Vishal", "Manjesh", "Ram", "Eshwar" };
			String[] expectedArr = { "Arjun", "Arun", "Eshwar", "Manjesh", "Raju", "Ram", "Vishal" };

			Assert.assertEquals(sort.getSortedArray(inputArr), expectedArr);
		} catch (AssertionError e) {
			Reporter.log("AssertionError occurred: " + e, true);
			Assert.assertTrue(false);
		} catch (Exception e) {
			Reporter.log("Exception occurred: " + e, true);
			Assert.assertTrue(false);
		}

		Reporter.log("TestStringMergeSort: End of testMergeSortForStringArray2() method", true);
	}
}
