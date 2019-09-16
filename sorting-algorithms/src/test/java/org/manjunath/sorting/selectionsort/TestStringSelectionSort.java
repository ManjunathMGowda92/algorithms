package org.manjunath.sorting.selectionsort;

import org.manjunath.algorithms.testdocumentation.TestCase;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class TestStringSelectionSort {
	private StringSelectionSort sort;

	@BeforeClass
	public void doInitialization() {
		sort = new StringSelectionSort();
	}

	@Test(testName = "testSelectionSortForStrings1", alwaysRun = true)
	@TestCase(Author = "Manjunath HM", 
	testCaseDescription = "Test the sorting method for Strings", 
	expectedResult = "Method should return the sorted array of Strings")
	public void testSelectionSortForStrings1() {
		Reporter.log("TestStringSelectionSort: Strat of testSelectionSortForStrings1() method", true);
		
		try {
			String[] inputArray = {"raju", "ravi", "ranga", "rama", "rajesh", "reddy"};
			String[] expectedArray = {"rajesh", "raju", "rama", "ranga", "ravi", "reddy"};
			
			Assert.assertEquals(sort.getSortedArray(inputArray), expectedArray);
			
		} catch (AssertionError e) {
			Reporter.log("AssertionError occurred: "+e, true);
			Assert.assertTrue(false);
		} catch (Exception e) {
			Reporter.log("Exception occurred: "+e, true);
			Assert.assertTrue(false);
		}
		
		Reporter.log("TestStringSelectionSort: End of testSelectionSortForStrings1() method", true);
	}

	@AfterClass
	public void doDestroy() {
		sort = null;
	}
}
