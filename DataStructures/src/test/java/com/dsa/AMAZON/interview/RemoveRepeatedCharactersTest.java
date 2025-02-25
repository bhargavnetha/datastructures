package com.dsa.AMAZON.interview;

import static org.junit.Assert.assertEquals;
import org.junit.jupiter.api.Test;

public class RemoveRepeatedCharactersTest {

	@Test
	public void testRemoveRepeatedCharsJava8() {
		String input = "bhargav";
        String expected = "bhargv";
        String actual = RemoveRepeatedCharacters.removeRepeatedCharsJava8(input);
		assertEquals(expected, actual,"Should remove all duplicate characters");
	}
}
