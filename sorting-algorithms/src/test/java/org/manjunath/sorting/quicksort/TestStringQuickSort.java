package org.manjunath.sorting.quicksort;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class TestStringQuickSort {
	private StringQuickSort sort;

	@BeforeClass
	public void doInitialization() {
		sort = new StringQuickSort();
	}

	public void testQuickSort1() {
		Reporter.log("TestStringQuickSort: Start of testQuickSort1() method", true);
		
		try {
			String[] inputArray = {"rtyu", "abcd", "aaeg", "ertw", "sdfe", "awse", "sdhes"};
			String[] expectedArray = {"aaeg","abcd","awse","ertw","rtyu","sdfe","sdhes"};
			
			Assert.assertEquals(sort.getSortedArray(inputArray), expectedArray);
			
		} catch (AssertionError e) {
			Reporter.log("AssertionError occurred: "+e, true);
			Assert.assertTrue(false);
		} catch (Exception e) {
			Reporter.log("Exception occurred: "+e, true);
			Assert.assertTrue(false);
		}
		
		Reporter.log("TestStringQuickSort: End of testQuickSort1() method", true);
	}

	@AfterClass
	public void doDestroy() {
		sort = null;
	}
}
