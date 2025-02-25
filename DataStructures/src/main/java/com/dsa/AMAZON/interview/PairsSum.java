package com.dsa.AMAZON.interview;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

// Find paris which give sum as result as -2
public class PairsSum {

	public static void main(String[] args) {
		int[] arr= {0,-3,10,9,1,-2};
		int target = -2;
		findParis(arr, target);
	}

	private static void findParis(int[] arr, int target) {
		Set<Integer> seen = new HashSet<>();
		List<int[]> result = new ArrayList<>();
		for (int num : arr) {
			int complement = target - num;
			if (seen.contains(complement)) {
				//result.add(new int[] { complement, num });
				System.out.println("("+complement+","+num+")");
			}
			seen.add(num);
		}
		
		for(int[] val : result) {
			System.out.println("("+val[0]+","+val[1]+")");
		}
		
	}
}
