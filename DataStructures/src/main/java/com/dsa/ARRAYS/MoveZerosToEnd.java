package com.dsa.ARRAYS;

public class MoveZerosToEnd {
	
	/*
	 
	  TC: O(n)
	  SC: O(1)
	 
	 */

	public static void main(String[] args) {
		int[] arr = { 0, 1, 2, 0, 3, 4, 0, 5 };
		moveZerosToEnd(arr);
		System.out.println("Array after moving zeros to the end:");
		for (int num : arr) {
			System.out.print(num + " ");
		}
	}

	private static void moveZerosToEnd(int[] arr) {
		int nonZeroIndex = 0; // Pointer to track where the next non-zero element should go
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] != 0) {
				int temp = arr[nonZeroIndex];
				arr[nonZeroIndex] = arr[i];
				arr[i] = temp;
				nonZeroIndex++;
			}
		}

	}
}
