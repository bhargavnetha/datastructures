package com.dsa.RECURSION;

public class FibonacciSeries {
	public static void main(String[] args) {
		int totalNumbers = 10;
		printNumbers(totalNumbers);
	}

	private static void printNumbers(int totalNumbers) {
		for (int i = 0; i < totalNumbers; i++) {
			System.out.println(fibonacci(i));
		}

	}

	private static int fibonacci(int n) {
		if (n <= 1) {
			return n;
		}
		return fibonacci(n - 1) + fibonacci(n - 2);
	}

}
