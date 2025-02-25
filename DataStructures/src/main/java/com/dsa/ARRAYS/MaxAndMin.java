package com.dsa.ARRAYS;

public class MaxAndMin {
	
	/* 
	 * The loop runs once through the array.
	 * Time complexity: O(n), where n is the number of elements in the array.
	 * 
	 * 
	 * Space Complexity
	 * Uses only a few variables for comparison.
	 * Space Complexity: O(1)
	 * 
	 * */

	public static void main(String[] args) {

		int[] arr = { 12, 45, 2, 10, 34, 7, 89, -5, 23 };

		int[] result = findLargestAndSmallest(arr);

		System.out.println("Smallest element: " + result[0]);
		System.out.println("Largest element: " + result[1]);
	}

	private static int[] findLargestAndSmallest(int[] arr) {
		if (arr == null || arr.length == 0) {
			throw new IllegalArgumentException("Array must not empty");
		}

		int small = arr[0];
		int large = arr[0];

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] < small) {
				small = arr[i];
			}
			if (arr[i] > large) {
				large = arr[i];
			}
		}
		return new int[] { small, large };
	}

}
