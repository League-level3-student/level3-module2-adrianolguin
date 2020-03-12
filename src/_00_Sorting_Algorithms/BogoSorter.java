package _00_Sorting_Algorithms;

import java.util.Random;

public class BogoSorter extends Sorter {
	public BogoSorter() {
		type = "Bogo";
	}

	// Bogo sort is a joke sorting algorithm. It is considered the most
	// inefficient sorting algorithm while still maintaining the possibility
	// of eventually sorting data.

	// It works by following these steps:
	// STEP 1. Is the array in order?
	// if yes, finished; if no, go to step 2.
	// STEP 2. Take two random elements in the array and swap them.
	// STEP 3. Go back to step 1.

	// 1. Complete the sort method using the Bogo sort algorithm.
	@Override
	void sort(int[] array, SortingVisualizer display) {
		Random r = new Random();
		while (!intArraySorted(array)) {
			display.updateDisplay();
			int index1 = r.nextInt(array.length-1);
			int index2 = r.nextInt(array.length-1);
			int temp = array[index1];
			array[index1] = array[index2];
			array[index2] = temp;
		}
	}

	static boolean intArraySorted(int[] intArr) {
		for (int i = 0; i < intArr.length - 1; i++) {
			if (intArr[i] > intArr[i + 1]) {
				return false;
			}
		}
		return true;
	}
}
