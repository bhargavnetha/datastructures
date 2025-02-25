package com.dsa.PATTERNS;

public class Pattern4 {

	public static void main(String[] args) {
		int rows = 4;
		printPattern(rows);
	}

	private static void printPattern(int rows) {
		for (int i = 1; i <= rows; i++) {
		    for (int j = rows; j > i; j--) {
		        System.out.print(" ");
		    }
		    for (int k = 1; k <= i; k++) {
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
	Pyramid pattern
 
 
 
 */