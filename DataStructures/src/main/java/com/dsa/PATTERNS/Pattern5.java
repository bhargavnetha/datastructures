package com.dsa.PATTERNS;

public class Pattern5 {


	public static void main(String[] args) {
		int rows = 4;
		printPattern(rows);
	}

	private static void printPattern(int rows) {
		for (int i = rows; i >= 1; i--) {
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


	* * * *
	 * * *
	  * *
	   *
	Inverted Pyramid


*/
