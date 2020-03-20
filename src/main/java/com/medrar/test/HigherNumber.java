package com.medrar.test;

import java.util.Arrays;

public class HigherNumber {

	private int[] values;
	private static final String ERROR_MESSAGE = "Array size must have 12 elements.";

	public HigherNumber(int[] values) {

		System.out.println("Array Values input: " + Arrays.toString(values));
		if (values.length != 12) {
			System.out.println("ERROR: " + ERROR_MESSAGE);
			throw new IllegalArgumentException(ERROR_MESSAGE);
		}
		this.values = values;

	}

	public int execute() {
		int higher = getHigherNumber(values[0], 1);
		System.out.println("The higher number is: " + higher);
		System.out.println("\n");
		return higher;
	}

	private int getHigherNumber(int actualValue, int i) {

		if (i >= values.length) {
			return actualValue;
		}
		if (values[i] > actualValue) {
			return getHigherNumber(values[i], i + 1);
		} else {
			return getHigherNumber(actualValue, i + 1);
		}
	}
}
