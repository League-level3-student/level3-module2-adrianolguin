package _02_More_Algorithms;

import java.util.List;

public class Algorithms {

	public static int findBrokenEgg(List<String> eggs) {
		for (int i = 0; i < eggs.size(); i++) {
			if (eggs.get(i) == "cracked") {
				return i;
			}
		}
		return -1;
	}

	public static int countPearls(List<Boolean> list) {
		int pearls = 0;
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i) == true) {
				pearls++;
			}
		}
		return pearls;
	}

	public static double findTallest(List<Double> list) {
		double largest = 0;
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i) > largest) {
				largest = list.get(i);
			}
		}
		return largest;
	}

	public static String findLongestWord(List<String> list) {
		String longest = "";
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i).length() > longest.length()) {
				longest = list.get(i);
			}
		}
		return longest;
	}

	public static boolean containsSOS(List<String> list) {
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i).contains("... --- ...")) {
				return true;
			}
		}
		return false;
	}

	public static List<Double> sortScores(List<Double> original) {
		List<Double> list = original;
		while (!doubleListSorted(list)) {
			for (int i = 0; i < list.size() - 1; i++) {
				if (list.get(i) > list.get(i + 1)) {
					double temp = list.get(i);
					list.set(i, list.get(i + 1));
					list.set(i + 1, temp);
				}
			}
		}
		return list;
	}

	static boolean doubleListSorted(List<Double> list) {
		for (int i = 0; i < list.size() - 1; i++) {
			if (list.get(i) > list.get(i + 1)) {
				return false;
			}
		}
		return true;
	}

	public static List<String> sortDNA(List<String> DNA) {
		List<String> sortedList = DNA;
		boolean isSorted = false;
		
		while (!isSorted) {
			
			for(int i = 0; i < sortedList.size() - 1; i++) {
				if(sortedList.get(i).length() > sortedList.get(i + 1).length()) {
					String temp = sortedList.get(i);
					sortedList.set(i, sortedList.get(i + 1));
					sortedList.set(i + 1, temp);
				}
			}
			
			for (int i = 0; i < sortedList.size() - 1; i++) {
				if (sortedList.get(i).length() > sortedList.get(i + 1).length()) {
					isSorted = false;
					i = sortedList.size();
				} else {
					isSorted = true;
				}
			}
		}
		return sortedList;

	}

	public static List<String> sortWords(List<String> list){
	
		List<String> sortedList = list;
		boolean isSorted = false;
		
		while (!isSorted) {
			
			for(int i = 0; i < sortedList.size() - 1; i++) {
				if(sortedList.get(i).compareTo(sortedList.get(i+1)) > 0) {
					String temp = sortedList.get(i);
					sortedList.set(i, sortedList.get(i + 1));
					sortedList.set(i + 1, temp);
				}
			}
			
			for (int i = 0; i < sortedList.size() - 1; i++) {
				if (sortedList.get(i).compareTo(sortedList.get(i+1)) > 0) {
					isSorted = false;
					i = sortedList.size();
				} else {
					isSorted = true;
				}
			}
		}
		return sortedList;
		
	}
	
}