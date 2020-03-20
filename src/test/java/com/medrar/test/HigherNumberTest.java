package com.medrar.test;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class HigherNumberTest {

	private HigherNumber higherNumber;

	@Test
	public void getHigherNumberThrowIllegalArgumentExceptionTest() {
		int[] values = { 1, 2, 3 };
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			higherNumber = new HigherNumber(values);
		});
		int[] values1 = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13 };
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			higherNumber = new HigherNumber(values1);
		});
	}

	@Test
	public void getHigherNumber() {
		int[] values = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12 };

		higherNumber = new HigherNumber(values);
		int higher = higherNumber.execute();
		assertTrue(higher == 12);

	}
	
	@Test
	public void getHigherNumberNegativeValuesTest() {
		int[] values = { 1, 1, 0, -3, 2, 2, 3, 1, -3, -6, 3, 1 };

		higherNumber = new HigherNumber(values);
		int higher = higherNumber.execute();
		assertTrue(higher == 3);

	}
}
