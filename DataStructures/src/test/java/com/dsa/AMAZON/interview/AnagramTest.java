package com.dsa.AMAZON.interview;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

public class AnagramTest {

	@Test
	public void testAnagramWithValidInputs() {
		/* Test the below method only if the testing method checkAnagram is a public method */
		
		assertTrue(Anagram.checkAnagram("man", "nam"), "Expected the strings to be anagrams");

	}
}
