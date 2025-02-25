package com.dsa.ARRAYS;

import java.util.Arrays;

public class InsertElements {

	public static void main(String[] args) {
		int[] arr = { 10, 20, 30, 40 };
		int element = 25;
		int index = 2;

		insertElements(arr, element, index);
	}

	private static void insertElements(int[] arr, int element, int index) {

		int[] newArray = new int[arr.length + 1];

		for (int i = 0, j = 0; i < newArray.length; i++) {

			if (i == index) {
				newArray[i] = element;
			} else {
				newArray[i] = arr[j];
				j++;
				// j is old array
				// i is newArray
			}
		}
		
		System.out.println("Array after insertion: " + Arrays.toString(newArray));

	}
}
