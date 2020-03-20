package com.medrar.test;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class NumberSumTest {

	private NumberSum numberSum;

	@Test
	public void numberSumThrowIllegalArgumentExceptionTest() {
		int value1 = 12345;
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			numberSum = new NumberSum(value1);
		});
		int value2 = 1234567;
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			numberSum = new NumberSum(value2);
		});
	}

	@Test
	public void numberSum() {
		int value1 = 123456;
		numberSum = new NumberSum(value1);
		int result = numberSum.execute();
		assertTrue(result == (1 + 2 + 3 + 4 + 5 + 6));

		int value2 = 987654;
		numberSum = new NumberSum(value2);
		result = numberSum.execute();
		assertTrue(result == (9 + 8 + 7 + 6 + 5 + 4));
	}

}
