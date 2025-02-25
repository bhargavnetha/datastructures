package com.dsa.AMAZON.interview;


import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.powermock.core.classloader.annotations.PrepareForTest;
import org.powermock.modules.junit4.PowerMockRunner;
import org.powermock.reflect.Whitebox;

import static org.junit.Assert.assertTrue;
import static org.powermock.api.support.membermodification.MemberMatcher.method;
//import static org.powermock.api.support.membermodification.MemberModifier.invokeStatic;


import java.lang.reflect.Method;

@RunWith(PowerMockRunner.class)
@PrepareForTest(Anagram.class)
public class AnagramTestMockito {

	@Test
	public void testCheckAnagram() throws Exception {
       
		Method method = method(Anagram.class, "checkAnagram", String.class, String.class);
		
		 //boolean result1 = (boolean) invokeStatic(method, "Listen", "Silent");
		
		 //boolean result1 =  Whitebox.invokeMethod(method, "man", "nam");
	       // System.out.println("Test 1 Result: " + result1); // Print result for debugging

		 //assertTrue(result1);


	}
}
