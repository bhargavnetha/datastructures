package com.dsa.ARRAYS;

import java.util.Arrays;

public class RotateArrayRightKTimes {
	
	/*
	 
	 TC: O(n)
	 SC: O(1)
	 
	 */

	public static void main(String[] args) {
		int[] arr = {1, 2, 3, 4, 5};
        int k = 3;
        System.out.println("Original array: " + Arrays.toString(arr));
        rightRotate(arr, k);

        System.out.println("Array after " + k + " right rotations: " + Arrays.toString(arr));
	}

	private static void rightRotate(int[] arr, int k) {
		 int n = arr.length;

	        // Handle cases where k >= n
	        k = k % n;

	        // Step 1: Reverse the entire array
	        reverse(arr, 0, n - 1);

	        // Step 2: Reverse the first k elements
	        reverse(arr, 0, k - 1);

	        // Step 3: Reverse the remaining n-k elements
	        reverse(arr, k, n - 1);
		
	}

	private static void reverse(int[] arr, int start, int end) {
		while (start < end) {
			int temp = arr[start];
			arr[start] = arr[end];
			arr[end] = temp;
			start++;
			end--;
		}
	}
}
