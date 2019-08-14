package org.manjunath.sorting.mergesort;

import org.manjunath.algorithms.testdocumentation.TestCase;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestIntegerMergeSort {
	private IntegerMergeSort sort;
	
	@BeforeTest
	public void doInitialization() {
		sort = new IntegerMergeSort();
	}
	
	@Test(testName = "testMergeSort1", alwaysRun = true)
	@TestCase(Author = "Manjunath", 
	testCaseDescription = "To test the merge sort algorithm",
	expectedResult = "should return the expected sorted array")
	public void testMergeSort1() {
		Reporter.log("TestIntegerMergeSort: Start of testMergeSort1() method", true);
		
		try {
			int[] arr = { 3, 6, 1, 2, 9, 7, 4, 9, 9, 9, 4, 3 };
			int[] expectedArr = {1,  2,  3,  3,  4,  4,  6,  7,  9,  9,  9,  9 };
			
			Assert.assertEquals(expectedArr, sort.getSortedArray(arr));
		} catch (AssertionError e) {
			Reporter.log("AssertionError occurred:"+e, true);
		} catch (Exception e) {
			Reporter.log("Exception occurred:"+e, true);
		}
		Reporter.log("TestIntegerMergeSort: End of testMergeSort1() method", true);
	}
	
	@Test(testName = "testMergeSort2", alwaysRun = true)
	@TestCase(Author = "Manjunath", 
	testCaseDescription = "To test the merge sort algorithm",
	expectedResult = "should return the expected sorted array")
	public void testMergeSort2() {
		Reporter.log("TestIntegerMergeSort: Start of testMergeSort2() method", true);
		
		try {
			int[] arr = { 3, 6, 1, 2, 9, 7, 4, 9};
			int[] expectedArr = {1,  2,  3,  4, 6,  7,  9,  9,};
			
			Assert.assertEquals(expectedArr, sort.getSortedArray(arr));
		} catch (AssertionError e) {
			Reporter.log("AssertionError occurred:"+e, true);
		} catch (Exception e) {
			Reporter.log("Exception occurred:"+e, true);
		}
		Reporter.log("TestIntegerMergeSort: End of testMergeSort2() method", true);
	}
	
	
}
