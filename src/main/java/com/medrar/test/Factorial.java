package com.medrar.test;

public class Factorial {

	private int value;
	private static final String ERROR_MESSAGE = "number value must be between 1 and 10.";

	public Factorial(int value) {

		System.out.println("Value input is: " + value);
		if (value < 1 || value > 10) {
			System.out.println("ERROR: " + ERROR_MESSAGE);
			throw new IllegalArgumentException(ERROR_MESSAGE);
		}
		this.value = value;
	}

	public int execute() {
		int result = getFactorial(value);
		System.out.println("Factorial result is: : " + result);
		System.out.println("\n");
		return result;
	}

	private int getFactorial(int value) {
		if (value == 1) {
			return value;
		} else {
			return value * getFactorial(value - 1);
		}
	}

}
