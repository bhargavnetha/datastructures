package com.dsa.RECURSION;

public class Factorial {

	public static void main(String[] args) {
		int number = 10;
		System.out.println(calculateFactorial(number));
	}

	private static int calculateFactorial(int number) {
		if (number == 0 || number == 1) {
			return 1;
		}
		return number * (number - 1);
	}
}
