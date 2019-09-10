package org.manjunath.sorting.selectionsort;

import org.manjunath.algorithms.testdocumentation.TestCase;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class TestCharacterSelectionSort {
	private CharacterSelectionSort sort;
	
	@BeforeClass
	public void doInitialization() {
		sort = new CharacterSelectionSort();
	}
	
	@Test(testName = "testSelectionSort1", alwaysRun = true)
	@TestCase(Author = "Manjunath HM", testCaseDescription = "test the selection sort algorithm for Character Array",
	expectedResult = "Method should return the Sorted array")
	public void testSelectionSort1() {
		Reporter.log(getClass()+" : Start of testSelectionSort1() method", true);
		
		try {
			char[] inputArray = {'t', 'y', 'r', 'e', 'd', 'f', 's', 'u', 'a', 'b', 'p'};
			char[] expectedArray = {'a', 'b', 'd', 'e', 'f', 'p', 'r', 's', 't', 'u', 'y'};
			
			Assert.assertEquals(sort.getSortedArray(inputArray), expectedArray);
		} catch (AssertionError e) {
			Reporter.log("AssertionError occurred :"+e, true);
			Assert.assertTrue(false);
		} catch (Exception e) {
			Reporter.log("Exception occurred :"+e, true);
			Assert.assertTrue(false);
		}
		
		Reporter.log(getClass()+" : End of testSelectionSort1() method", true);
	}
	
	@AfterClass
	public void doDestroy(){
		sort = null;
	}
}
