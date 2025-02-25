package com.dsa.ARRAYS;

import java.util.HashSet;

public class PairsSumToTarget {

	
	//TC: O(n)
	//SC: O(n)
	
	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 4, 5, 6, 7 };
		int target = 9;
		findPairs(target, arr);
	}

	private static void findPairs(int target, int[] arr) {
		HashSet<Integer> set = new HashSet<>();
		for(int num : arr) {
			int complement = target-num;
			if(set.contains(complement)) {
				System.out.println("("+complement+","+num+")");
			}
			set.add(num);
		}
	}
}
