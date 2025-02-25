package com.dsa.ARRAYS;

import java.util.Arrays;

public class RemoveDuplicates {
	
	/*
	 
	  Time: O(nlogn) for sorting and O(n) for traversal, so overall O(nlogn).
	  Space: O(1) for in-place sorting.
	  
	  */

	public static void main(String[] args) {
		//Node node;
		
		int[] arr = { 4, 2, 7, 2, 4, 8, 3, 7 };
		int[] uniqueArray = removeDuplicates(arr);
		System.out.println(uniqueArray);
	}

	private static int[] removeDuplicates(int[] arr) {
		Arrays.sort(arr);
		int uniqueIndex = 0;
		
		for(int i=1; i<arr.length; i++) {
			if(arr[i]!=arr[uniqueIndex]) {
				uniqueIndex++;
				arr[uniqueIndex]=arr[i];
			}
		}
		
		return Arrays.copyOf(arr, uniqueIndex+1);
	}
}
