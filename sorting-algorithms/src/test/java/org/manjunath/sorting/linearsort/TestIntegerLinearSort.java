package org.manjunath.sorting.linearsort;

import org.manjunath.algorithms.testdocumentation.TestCase;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class TestIntegerLinearSort {
	private IntegerLinearSort sort;

	@BeforeClass
	public void doInitialization() {
		sort = new IntegerLinearSort();
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

	@AfterClass
	public void doDestroy() {
		sort = null;
	}
}
