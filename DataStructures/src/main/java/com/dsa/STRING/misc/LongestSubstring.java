package com.dsa.STRING.misc;

import java.util.HashSet;
import java.util.Set;

public class LongestSubstring {

	public static void main(String[] args) {
		String input = "abcabcbb";
		int result = lengthOfLongestSubstring(input);
		System.out.println("The length of longest substring :"+result);
	}

	private static int lengthOfLongestSubstring(String str) {
		
		 Set<Character> seen = new HashSet<>();
	        int maxLength = 0;
	        int left = 0;

	        for (int right = 0; right < str.length(); right++) {
	            while (seen.contains(str.charAt(right))) {
	                // Remove characters until the duplicate is resolved
	                seen.remove(str.charAt(left));
	                left++;
	            }
	            seen.add(str.charAt(right)); // Add the current character to the set
	            maxLength = Math.max(maxLength, right - left + 1);
	        }
	       // System.out.println(seen.size());

	        return maxLength;
	}
}
