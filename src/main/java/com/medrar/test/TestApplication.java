package com.medrar.test;

import java.util.Random;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class TestApplication {
	private static Random rnd = new Random();

	public static void main(String[] args) {
		SpringApplication.run(TestApplication.class, args);

		System.out.println("*********Higher Number Program*********");
		int[] values = generateArray();
		HigherNumber higherNumber = new HigherNumber(values);
		higherNumber.execute();

		System.out.println("*********Sum digits Program*********");
		NumberSum numberSum = new NumberSum(generateRandomNumber(999999));
		numberSum.execute();

		System.out.println("*********Factorial Program*********");
		Factorial factorial = new Factorial(generateRandomNumber(11));
		factorial.execute();

	}

	private static int[] generateArray() {
		int[] array = new int[12];
		for (int i = 0; i < 12; i++) {
			array[i] = generateRandomNumber(999);
		}
		return array;
	}

	private static int generateRandomNumber(int randomPattern) {
		int rand = 0;
		while (true) {
			rand = rnd.nextInt(randomPattern);
			if (rand != 0)
				break;
		}

		return rand;
	}

}
