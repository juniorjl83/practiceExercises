package com.medrar.test;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class FactorialTest {

	private Factorial factorial;

	@Test
	public void fatorialThrowIllegalArgumentExceptionTest() {
		int value1 = 0;
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			factorial = new Factorial(value1);
		});

		int value2 = 11;
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			factorial = new Factorial(value2);
		});
	}

	@Test
	public void fatorialTest() {
		int value = 3;
		factorial = new Factorial(value);
		int result = factorial.execute();
		assertTrue(result == (1 * 2 * 3));

		value = 6;
		factorial = new Factorial(value);
		result = factorial.execute();
		assertTrue(result == (1 * 2 * 3 * 4 * 5 * 6));
	}
}
