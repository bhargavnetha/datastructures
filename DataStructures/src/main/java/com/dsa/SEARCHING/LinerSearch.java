package com.dsa.SEARCHING;

public class LinerSearch {

	/*
	 
	 Description: Traverses the array sequentially and checks each element.
	 Time Complexity: 𝑂(𝑛) 
	 Space Complexity: 𝑂(1)
	 
	 */

	public static void main(String[] args) {
		int[] arr = { 10, 20, 30, 40, 50 };
		int key = 30;
		System.out.println("Key found at "+ linearSearch(arr, key));
	}

	private static int linearSearch(int[] arr, int key) {
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == key) {
				return i;
			}
		}
		return -1;
	}
}
