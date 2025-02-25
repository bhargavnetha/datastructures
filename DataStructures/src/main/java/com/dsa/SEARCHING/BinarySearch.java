package com.dsa.SEARCHING;

public class BinarySearch {

	/*
	 * 
	 	Description: Searches a sorted array by repeatedly dividing the search
	 	interval in half. Time Complexity: 𝑂(log 𝑛) Space
	 	Complexity:𝑂(1)(iterative) or 𝑂(log 𝑛)(recursive)
	 * 
	 */

	public static void main(String[] args) {
		int[] arr = { 2, 3, 5, 7, 11, 13, 17, 19, 23, 29 };
		int target = 17;

		int result = binarySearch(arr, target);
		if (result == -1) {
			System.out.println("Element not found");
		} else {
			System.out.println("Element has found at index: " + result);
		}
	}

	private static int binarySearch(int[] arr, int target) {
		int left = 0;
		int right = arr.length - 1;

		while (left <= right) {
			int mid = left + (right - left) / 2;
			if (arr[mid] == target) {
				return mid;
			} else if (arr[mid] < target) {
				left = mid + 1;
			} else {
				right = mid - 1;
			}
		}

		return 1;
	}
}
