package com.dsa.AMAZON.interview;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GroupAnagrams {

	
	/*
	  	Time complexity: O(n.klogk)
	  	Space complexity: O(n.k)
	  	
	 */
	
	public static void main(String[] args) {
		String[] input = { "eat", "tan", "nat", "tea" }; // [eat, tea][tan, nat]

		List<List<String>> result = groupAnagrams(input);

		for (List<String> group : result) {
			//System.out.println(group);
		}
	}

	private static List<List<String>> groupAnagrams(String[] input) {

		Map<String, List<String>> anagramGroups = new HashMap<>();
		for (String str : input) {
			char[] charArr = str.toCharArray();
			Arrays.sort(charArr);
			String sortedKey = new String(charArr);
			//System.out.println(sortedKey);
			if (!anagramGroups.containsKey(sortedKey)) {
				anagramGroups.put(sortedKey, new ArrayList<String>());
				
				System.out.println(anagramGroups);
			}
			anagramGroups.get(sortedKey).add(str);
		}
		return new ArrayList<>(anagramGroups.values());
	}
}
