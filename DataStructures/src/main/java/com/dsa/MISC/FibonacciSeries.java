package com.dsa.MISC;

public class FibonacciSeries {

	public static void main(String[] args) {
		int totalNumbers = 10;
		int firstNumber = 0;
		int secondNumber = 1;
		printNumbers(totalNumbers, firstNumber, secondNumber);
	}

	private static void printNumbers(int totalNumbers, int firstNumber, int secondNumber) {
		System.out.println(firstNumber + " , " + secondNumber);
		for (int i = 3; i < totalNumbers; i++) {
			int next = firstNumber + secondNumber;
			System.out.println(", " + next);
			firstNumber = secondNumber;
			secondNumber = next;
		}
	}
}
