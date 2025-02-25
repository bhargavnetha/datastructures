package com.dsa.STRING;

import java.util.HashMap;

public class FirstNonRepeating {

	public static void main(String[] args) {
		String s = "bhargav";
		firstNonRepeating(s);
	}

	private static void firstNonRepeating(String s) {
		HashMap<Character, Integer> charCount = new HashMap<Character, Integer>();

		for (char c : s.toCharArray()) {
			charCount.put(c, charCount.getOrDefault(c, 0) + 1);
		}
		
		for(char c : s.toCharArray()) {
			if(charCount.get(c)==1) {
				System.out.println("the first non repeating character is "+ c);
				return;
			}
		}
	}
}
