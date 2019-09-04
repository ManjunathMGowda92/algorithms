package org.manjunath.sorting.quicksort;

import org.manjunath.algorithms.testdocumentation.TestCase;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class TestIntegerQuickSort {
	private IntegerQuickSort sort;

	@BeforeClass
	public void doInitialization() {
		sort = new IntegerQuickSort();
	}

	@Test(testName = "testQuickSortMethod1", alwaysRun = true)
	@TestCase(Author = "Manjunath HM", testCaseDescription = "to test the quickSort algorithm for the Integer array", expectedResult = "method should return sorted array")
	public void testQuickSortMethod1() {
		Reporter.log("TestIntegerQuickSort: Start of testQuickSortMethod1() Method", true);
		
		try {
			int[] inputArray = { 6, 3, 1, 8, 9, 4, 5, 7, 10, 17, 18, 15 };
			int[] expectedArray = {1, 3, 4, 5, 6, 7, 8, 9, 10, 15, 17, 18};
			
			Assert.assertEquals(sort.getSortedArray(inputArray), expectedArray);
		} catch (AssertionError e) {
			Reporter.log("AssertionError occurred: "+e, true);
			Assert.assertTrue(false);
		} catch (Exception e) {
			Reporter.log("Exception occurred: "+e, true);
			Assert.assertTrue(false);
		}
		
		Reporter.log("TestIntegerQuickSort: End of testQuickSortMethod1() Method", true);
	}
	
	@Test(testName = "testQuickSortMethod2", alwaysRun = true)
	@TestCase(Author = "Manjunath HM", testCaseDescription = "to test the quickSort algorithm for the Integer array", expectedResult = "method should return sorted array")
	public void testQuickSortMethod2() {
		Reporter.log("TestIntegerQuickSort: Start of testQuickSortMethod1() Method", true);
		
		try {
			int[] inputArray = { 56, 65, 24, 98, 34, 16, 74, 97, 68 };
			int[] expectedArray = {16, 24, 34, 56, 65, 68, 74, 97, 98 };
			
			Assert.assertEquals(sort.getSortedArray(inputArray), expectedArray);
		} catch (AssertionError e) {
			Reporter.log("AssertionError occurred: "+e, true);
			Assert.assertTrue(false);
		} catch (Exception e) {
			Reporter.log("Exception occurred: "+e, true);
			Assert.assertTrue(false);
		}
		
		Reporter.log("TestIntegerQuickSort: End of testQuickSortMethod1() Method", true);
	}

	@AfterClass
	public void doDestroy() {
		sort = null;
	}
}
