package org.manjunath.sorting.selectionsort;

import org.manjunath.algorithms.testdocumentation.TestCase;
import org.manjunath.sorting.selectionsort.IntegerSelectionSort;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class TestIntegerSelectionSort {
	private IntegerSelectionSort sort;

	@BeforeClass
	public void doInitialization() {
		sort = new IntegerSelectionSort();
	}

	@Test(testName = "testLinearSort1()", alwaysRun = true)
	@TestCase(Author = "Manjunath HM", expectedResult = "array to be sorted", testCaseDescription = "To test the linear sorting algorithm for the given input array")
	public void testLinearSort1() {
		Reporter.log("TestIntegerLinearSort: Start of testLinearSort1() method", true);
		try {
			int[] inputArray = { 6, 8, 2, 1, 5, 3, 9, 0, 4 };
			int[] expectedArray = { 0, 1, 2, 3, 4, 5, 6, 8, 9 };

			Assert.assertEquals(sort.getSortedArray(inputArray), expectedArray);
		} catch (AssertionError e) {
			Reporter.log("AssertionError occurred: " + e, true);
			Assert.assertTrue(false);
		} catch (Exception e) {
			Reporter.log("Exception occurred: " + e, true);
			Assert.assertTrue(false);
		}
		Reporter.log("TestIntegerLinearSort: End of testLinearSort1() method", true);
	}
	
	@Test(testName = "testLinearSort1()", alwaysRun = true)
	@TestCase(Author = "Manjunath HM", expectedResult = "array to be sorted", testCaseDescription = "To test the linear sorting algorithm for the given input array")
	public void testLinearSort2() {
		Reporter.log("TestIntegerLinearSort: Start of testLinearSort2() method", true);
		try {
			int[] inputArray = {64, 81, 24, 13, 55, 33, 92, 67, 46, 12, 87, 43};
			int[] expectedArray = {12, 13, 24, 33, 43, 46, 55, 64, 67, 81, 87, 92};

			Assert.assertEquals(sort.getSortedArray(inputArray), expectedArray);
		} catch (AssertionError e) {
			Reporter.log("AssertionError occurred: " + e, true);
			Assert.assertTrue(false);
		} catch (Exception e) {
			Reporter.log("Exception occurred: " + e, true);
			Assert.assertTrue(false);
		}
		Reporter.log("TestIntegerLinearSort: End of testLinearSort2() method", true);
	}

	@AfterClass
	public void doDestroy() {
		sort = null;
	}
}
