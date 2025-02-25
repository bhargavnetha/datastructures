package com.dsa.PATTERNS;

public class Pattern1 {

	public static void main(String[] args) {
		int rows = 4;
		printPattern(rows);
	}

	private static void printPattern(int rows) {
		for (int i = 1; i <= rows; i++) {
			for (int j = rows; j >= (rows + 1) - i; j--) {
				System.out.print(j + " ");
			}
			System.out.println();
		}
	}
}

/*
	4
	4 3
	4 3 2
	4 3 2 1

*/
