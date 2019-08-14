package org.manjunath.linearsearch;

import org.manjunath.algorithms.testdocumentation.TestCase;
import org.manjunath.linearsearch.IntegerLinerSearch;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestIntegerLinearSearch {
	private IntegerLinerSearch serach;
	
	@BeforeTest
	public void doInitialization() {
		serach = new IntegerLinerSearch();
	}
	
	@Test(testName = "testLinearSearch1", alwaysRun = true)
	@TestCase(Author = "Manjunath HM", 
	testCaseDescription = "Testing the Linear Search algorithm", 
	expectedResult = "linear search method should return the appropriate index of element")
	public void testLinearSearch1() {
		Reporter.log("TestIntegerLinearSearch : Start of testLinearSearch1() method", true);
		
		try {
			int arr[] = {5, 2, 7, 9, 11, 6, 8, 3};
			
			Assert.assertEquals(serach.linearSearch(arr, 8), 6);
		} catch (AssertionError e) {
			Reporter.log("AssertionError occurred: "+e, true);
		} catch (Exception e) {
			Reporter.log("Exception occurred: "+e, true);
		}
		
		Reporter.log("TestIntegerLinearSearch : End of testLinearSearch1() method", true);
	}
	
	@Test(testName = "testLinearSearch1", alwaysRun = true)
	@TestCase(Author = "Manjunath HM", 
	testCaseDescription = "Testing the Linear Search algorithm", 
	expectedResult = "linear search method should return -1 as the element not present")
	public void testLinearSearch2() {
		Reporter.log("TestIntegerLinearSearch : Start of testLinearSearch1() method", true);
		
		try {
			int arr[] = {5, 2, 7, 9, 11, 6, 8, 3};
			
			Assert.assertEquals(serach.linearSearch(arr, 12), -1);
		} catch (AssertionError e) {
			Reporter.log("AssertionError occurred: "+e, true);
		} catch (Exception e) {
			Reporter.log("Exception occurred: "+e, true);
		}
		
		Reporter.log("TestIntegerLinearSearch : End of testLinearSearch1() method", true);
	}
	
	@AfterTest
	public void doDestroy() {
		serach = null;
	}
}
