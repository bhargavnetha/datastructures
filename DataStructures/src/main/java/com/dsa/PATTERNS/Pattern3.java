package com.dsa.PATTERNS;

public class Pattern3 {

	public static void main(String[] args) {
		int rows = 4;
		printPattern(rows);
	}

	private static void printPattern(int rows) {
		for (int i = 1; i <= rows; i++) { 
			for (int j = 1; j <= rows - i + 1; j++) { 
				System.out.print("* ");
			}
			System.out.println(); 
		}
	}
}

/*

	Reverse right angle triange
	
	* * * *
	* * *
	* *
	*


 */
 