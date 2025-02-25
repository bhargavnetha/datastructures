package com.dsa.PATTERNS;

public class Pattern2 {

	public static void main(String[] args) {
		int rows= 4;
		printPattern(rows);
	}

	private static void printPattern(int rows) {
		for (int i = 1; i <= rows; i++) {
		    for (int j = 1; j <= i; j++) {
		        System.out.print("* ");
		    }
		    System.out.println();
		}
	}
}

/*
 
	*
	* *
	* * *
	* * * *
	
	Right angled triangle
 
 */
