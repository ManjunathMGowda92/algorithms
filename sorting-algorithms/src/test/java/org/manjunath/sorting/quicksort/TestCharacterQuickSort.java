package org.manjunath.sorting.quicksort;

import org.manjunath.algorithms.testdocumentation.TestCase;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class TestCharacterQuickSort {
	private CharacterQuickSort sort;

	@BeforeClass
	public void doInitialization() {
		sort = new CharacterQuickSort();
	}

	@Test(testName = "testQuickSort1", alwaysRun = true)
	@TestCase(Author = "Manjunath HM", testCaseDescription = "to test quickSort for the Characters", expectedResult = "method should return the sorted array")
	public void testQuickSort1() {
		Reporter.log("TestCharacterQuickSort: Start of testQuickSort1() method", true);
		
		try {
			char[] inputArray = {'k', 't', 'r', 'e', 'w', 'a', 'f', 'l', 'w', 'x', 'g'};
			char[] expectedArray = {'a', 'e', 'f', 'g', 'k', 'l', 'r', 't', 'w', 'w', 'x'};
			
			Assert.assertEquals(sort.getSortedArray(inputArray), expectedArray);
		} catch (AssertionError e) {
			Reporter.log("AssertionError occurred:"+e, true);
			Assert.assertTrue(false);
		} catch (Exception e) {
			Reporter.log("Exception occurred:"+e, true);
			Assert.assertTrue(false);
		}
		Reporter.log("TestCharacterQuickSort: End of testQuickSort1() method", true);
	}
	
	@Test(testName = "testQuickSort2", alwaysRun = true)
	@TestCase(Author = "Manjunath HM", testCaseDescription = "to test quickSort for the Characters", expectedResult = "method should return the sorted array")
	public void testQuickSort2() {
		Reporter.log("TestCharacterQuickSort: Start of testQuickSort2() method", true);
		
		try {
			char[] inputArray = {'f', 'l', 'w', 'x', 'g', 'a', 'e', 'f', 'k', 'e', 'w', 'y', 'o'};
			char[] expectedArray = {'a', 'e', 'e', 'f', 'f', 'g', 'k', 'l', 'o', 'w', 'w', 'x', 'y'};
			
			Assert.assertEquals(sort.getSortedArray(inputArray), expectedArray);
		} catch (AssertionError e) {
			Reporter.log("AssertionError occurred:"+e, true);
			Assert.assertTrue(false);
		} catch (Exception e) {
			Reporter.log("Exception occurred:"+e, true);
			Assert.assertTrue(false);
		}
		Reporter.log("TestCharacterQuickSort: End of testQuickSort2() method", true);
	}

	@AfterClass
	public void doDestroy() {
		sort = null;
	}
}
