package _01_Searching_Algorithms;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class _04_SearchTest {

	// A MINIMUM OF 3 TESTS ARE REQUIRED FOR EACH METHOD
	_00_LinearSearch linearSearch = new _00_LinearSearch();
	_01_BinarySearch binarySearch = new _01_BinarySearch();
	_02_InterpolationSearch interpolationSearch = new _02_InterpolationSearch();
	_03_ExponentialSearch exponentialSearch = new _03_ExponentialSearch();
	@Test
	public void testLinearSearch() {
		//1. use the assertEquals method to test your linear search method.
		String[] array = new String[] {"0","1","37","9","20"};		
		assertEquals(linearSearch.linearSearch(array, "37"), 2);
		assertEquals(linearSearch.linearSearch(array, "0"), 0);
		assertEquals(linearSearch.linearSearch(array, "20"), 4);
	}

	@Test
	public void testBinarySearch() {
		//2. use the assertEquals method to test your binary search method.
		//   remember that the array must be sorted
		int[] testArray = new int[] {0,1,2,3,4,5,6,7,8,9,10};
		assertEquals(binarySearch.binarySearch(testArray, 0, testArray.length, 0), 0);
		assertEquals(binarySearch.binarySearch(testArray, 0, testArray.length, 1), 1);
		assertEquals(binarySearch.binarySearch(testArray, 0, testArray.length, 2), 2);
		assertEquals(binarySearch.binarySearch(testArray, 0, testArray.length, 3), 3);
		assertEquals(binarySearch.binarySearch(testArray, 0, testArray.length, 4), 4);
	}
	
	@Test
	public void testInterpolationSearch() {
		//3. use the assertEquals method to test your interpolation search method.
		//   remember that the array must be sorted and evenly distributed
		int[] testArray = new int[] {0,1,2,3,4,5,6,7,8,9,10};
		assertEquals(interpolationSearch.interpolationSearch(testArray, 0), 0);
		assertEquals(interpolationSearch.interpolationSearch(testArray, 5), 5);
		assertEquals(interpolationSearch.interpolationSearch(testArray, 10), 10);
	}
	
	@Test
	public void testExponentialSearch() {
		//4. use the assertEquals method to test your exponential search method.
		//   remember that the array must be sorted
		int[] testArray = new int[] {0,1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20};
		assertEquals(exponentialSearch.exponentialSearch(testArray, 0), 0);
		assertEquals(exponentialSearch.exponentialSearch(testArray, 20), 20);
		assertEquals(exponentialSearch.exponentialSearch(testArray, 5), 5);
		assertEquals(exponentialSearch.exponentialSearch(testArray, 7), 7);
		assertEquals(exponentialSearch.exponentialSearch(testArray, 9), 9);
	}
}
