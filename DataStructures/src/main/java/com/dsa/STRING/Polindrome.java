package com.dsa.STRING;

public class Polindrome {

	public static void main(String[] args) {
		String s = "madam";
		polindromcheck(s);
	}

	private static void polindromcheck(String s) {
		
		int left=0;
		int right=s.length()-1;
		boolean isPolindrome = true;
		
		while(left<right) {
			if(s.charAt(left)!=s.charAt(right)) {
				isPolindrome=false;
				break;
			}
			left++;
			right--;
		}
		
		if(isPolindrome) {
			System.out.println("Given string is a polindrome");
		}else {
			System.out.println("Not polindrome");
		}

	}
}
