package com.dsa.AMAZON.interview;

import java.util.LinkedHashSet;
import java.util.stream.Collectors;

public class RemoveRepeatedCharacters {

	public static void main(String[] args) {
		String str = "bhargav";
		String afterRemoval = removeRepeatedCharsJava8(str);
		String afterRemo = removeRepeatedCharsAlternativeApproach(str);
		System.out.println(afterRemoval);
	}

	/*
	 	Time complexity : O(n), where n is the length of the input string.
	 */
	
	public static String removeRepeatedCharsJava8(String str) {
		return str.chars().distinct() // get distint characters
				.mapToObj(c -> String.valueOf((char) c)) // Converting string to a char
				.collect(Collectors.joining()); // join characters back to a string
	}
	
	/*
	 
	 
	 Time Complexity: O(n) (on average), as LinkedHashSet operations (additions) are 


	 */
	public static String removeRepeatedCharsAlternativeApproach(String s) {
		LinkedHashSet<Character> set = new LinkedHashSet<>();
		
		for(char ch: s.toCharArray()) {
			set.add(ch);
		}
		
		StringBuilder sb = new StringBuilder();
		for(char ch: set) {
			sb.append(ch);
		}
		return sb.toString();
		
	}
}
