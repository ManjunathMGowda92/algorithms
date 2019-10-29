package org.manjunath.sorting.bubblesort;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class TestCharacterBubbleSort {
	private CharacterBubbleSort sort;
	
	@BeforeClass
	public void doInitialization() {
		sort = new CharacterBubbleSort();
	}
	
	public void testCharacterSort1() {
		Reporter.log("TestCharacterBubbleSort: Start of testCharacterSort1() method", true);
		
		try {
			char[] inputArray = {'t', 'd', 's','e','a','n','b','r'};
			char[] expectedArray = { 'a', 'b', 'd', 'e', 'n', 'r', 's', 't' };
			
			Assert.assertEquals(expectedArray, sort.getSortedArray(inputArray));
		} catch (AssertionError e) {
			Reporter.log("AssertionError occurred: "+e, true);
			Assert.assertTrue(false);
		} catch (Exception e) {
			Reporter.log("Exception occurred: "+e, true);
			Assert.assertTrue(false);
		}
		
		Reporter.log("TestCharacterBubbleSort: End of testCharacterSort1() method", true);
	}
	
	@AfterClass
	public void doDestroy() {
		sort = null;
	}
}
