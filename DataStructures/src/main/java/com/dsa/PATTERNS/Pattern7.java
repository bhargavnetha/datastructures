package com.dsa.PATTERNS;

public class Pattern7 {

	public static void main(String[] args) {
		int rows = 4;
		printPattern(rows);
	}

	private static void printPattern(int rows) {
		int count = 1;
		for (int i = 1; i <= rows; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(count++ + " ");
			}
			System.out.println();
		}
	}
}


/*
 
 
	1
	2 3
	4 5 6
	7 8 9 10
	Floyd’s Triangle

 
 
 */
