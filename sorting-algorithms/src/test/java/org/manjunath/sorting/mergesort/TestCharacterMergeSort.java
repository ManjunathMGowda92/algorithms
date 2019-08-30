package org.manjunath.sorting.mergesort;

import org.manjunath.algorithms.testdocumentation.TestCase;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

/**
 * Class TestCharacterMergeSort is used to test the CharacterMergeSort algorithm
 * 
 * @author Manjunath HM
 *
 */
public class TestCharacterMergeSort {
	private CharacterMergeSort sort;
	
	@BeforeTest
	public void doInitialization() {
		sort = new CharacterMergeSort();
	}
	
	@Test(testName = "testCharacterMergeSortAlgo1", alwaysRun = true)
	@TestCase(Author = "Manjunath HM", 
			testCaseDescription = "test the merge sort algorithm for the array of characters",
			expectedResult = "should return the sorted array")
	public void testCharacterMergeSortAlgo1() {
		Reporter.log("TestCharacterMergeSort: Start of testCharacterMergeSortAlgo1() method", true);
		
		try {
			char[] inputArr = {'g', 'k', 'i', 'd', 'a', 't', 'y', 'e', 'b', 'a', 's', 'l'};
			char[] expectedArr = {'a' ,'a' ,'b' ,'d' ,'e' ,'g' ,'i' ,'k' ,'l' ,'s' ,'t' ,'y'};
			
			Assert.assertEquals(sort.getSortedArray(inputArr), expectedArr);
		} catch (AssertionError e) {
			Reporter.log("AssertionError occurred: "+e, true);
			Assert.assertTrue(false);
		} catch (Exception e) {
			Reporter.log("Exception occurred: "+e, true);
			Assert.assertTrue(false);
		}
		
		Reporter.log("TestCharacterMergeSort: End of testCharacterMergeSortAlgo1() method", true);
	}
}
