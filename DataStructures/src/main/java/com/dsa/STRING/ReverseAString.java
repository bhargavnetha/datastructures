package com.dsa.STRING;

public class ReverseAString {

	public static void main(String[] args) {
		String s = "bhargav";
		reverse(s);
	}

	private static void reverse(String s) {
		StringBuilder sb = new StringBuilder();
		for(int i=s.length()-1; i>=0; i--) {
			sb.append(s.charAt(i));
		}
		System.out.println(sb.toString());
		

	}
}
