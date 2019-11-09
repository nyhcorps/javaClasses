package com.class16;

public class IQ7 {

	public static void main(String[] args) {
		/*
		 * Write a java program to check whether a given number is prime or not
		 * 
		 */

		int num = 0;
		boolean isPrime = true;

		if (num == 0 || num == 1) {
			isPrime = false;
		} else {

			for (int i = 2; i <= num; i++) {
				if (num % i == 0) {
					isPrime = false;
				}
			}
		}
		if (isPrime) {
			System.out.println(num + " is a Prime number");
		} else {
			System.out.println(num + " is not a Prime number");
		}
	}

}
