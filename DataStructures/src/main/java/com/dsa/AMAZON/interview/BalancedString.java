package com.dsa.AMAZON.interview;

import java.util.Stack;

//TC : O(n)
//SC : O(n)

public class BalancedString {

	public static void main(String[] args) {
		String s1 = "{[()]}";
		String s2 = "{[(])}";
		System.out.println(isBalanced(s2));
	}

	private static boolean isBalanced(String str) {

		Stack<Character> stack = new Stack<>(); // to keep the track of open brackets

		for (char ch : str.toCharArray()) {
			if (ch == '(' || ch == '[' || ch == '{') { // If open bracket push it into stack
				stack.push(ch);
			} else if (ch == ')' || ch == ']' || ch == '}') {
				if (stack.isEmpty() || !isMatchingPair(stack.pop(), ch)) {
					return false;
				}
			}
		}
		return stack.isEmpty(); // if the stack is empty at the end then it's a balanced string
	}

	private static boolean isMatchingPair(char open, char close) {
		return (open == '(' && close == ')') || (open == '[' && close == ']') || (open == '{' && close == '}');
	}

}
