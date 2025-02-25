package com.dsa.STRING;

public class VowelsAndConsonetsCount {

	public static void main(String[] args) {
		String s = "Data Structures";
		countVowelsAndConsonents(s.toLowerCase());
	}

	private static void countVowelsAndConsonents(String s) {

		int vowels = 0;
		int consonats = 0;

		for (char c : s.toCharArray()) {
			if (c >= 'a' && c <= 'z') {
				if ("aeiou".indexOf(c) != -1) {
					vowels++;
				} else {
					consonats++;
				}
			}
		}

		System.out.println("Vowels: " + vowels);
		System.out.println("Consonants: " + consonats);

	}
}
