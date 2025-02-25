package com.dsa.AMAZON.interview;

import java.util.Arrays;
//TC: O(n log n)
//SC : O(n)
public class Anagram {

	//Function to check the  two strings are anagram or not. 
	public static void main(String[] args) {
		String str1 = "Listen";
		String str2 = "Silent";

		System.out.println(checkAnagram(str1, str2));
	}

	public static boolean checkAnagram(String str1, String str2) {

		str1 = str1.replaceAll("\\s", "").toLowerCase();
        str2 = str2.replaceAll("\\s", "").toLowerCase();

		if (str1.length() != str2.length()) {
			return false;
		}
		char[] ch1 = str1.toCharArray();
		char[] ch2 = str2.toCharArray();

		Arrays.sort(ch1);
		Arrays.sort(ch2);
		
		return Arrays.equals(ch1, ch2);
	}
}
