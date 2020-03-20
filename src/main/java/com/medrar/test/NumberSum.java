package com.medrar.test;

public class NumberSum {

	private int value;
	private static final String ERROR_MESSAGE = "Number character size must have 6 digits.";

	public NumberSum(int value) {
		System.out.println("Random six digit number generated: " + value);
		
		if (String.valueOf(value).length() != 6) {
			System.out.println("ERROR: " + ERROR_MESSAGE);
			throw new IllegalArgumentException(ERROR_MESSAGE);
		}
		this.value = value;
	}

	public int execute() {
		int result = sumDigits(value);
		System.out.println("Sum result is: : " + result);
		System.out.println("\n");
		return result;
	}

	private int sumDigits(int value) {
		if (String.valueOf(value).length() == 1) {
			return value;
		} else {
			int actual = value % 10;
			return actual + sumDigits(value / 10);
		}

	}
}
