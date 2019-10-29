package org.manjunath.sorting.bubblesort;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class TestIntegerBubbleSort {
	private IntegerBubbleSort sort;

	@BeforeClass
	public void doInitialization() {
		sort = new IntegerBubbleSort();
	}

	@Test(testName = "testBubbleSort1", alwaysRun = true)
	public void testBubbleSort1() {
		Reporter.log("TestIntegerBubbleSort: Start of testBubbleSort1() method", true);
		
		try {
			int[] inputArray = { 10, 4, 2, 7, 9, 11, 45, 23, -12 };
			int[] expectedArray = { -12, 2, 4, 7, 9, 10, 11, 23, 45 };
			
			Assert.assertEquals(expectedArray, sort.getSortedArray(inputArray));
		} catch (AssertionError e) {
			Reporter.log("AssertionError occurred: "+e, true);
			Assert.assertTrue(false);
		} catch (Exception e) {
			Reporter.log("Exception occurred: "+e, true);
			Assert.assertTrue(false);
		}
		
		Reporter.log("TestIntegerBubbleSort: End of testBubbleSort1() method", true);
	}

	@AfterClass
	public void doDestroy() {
		sort = null;
	}
}
