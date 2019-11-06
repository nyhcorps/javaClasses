package com.class13;

import java.util.Scanner;

public class Task2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String day = "Sunday";
		for (int i = day.length() - 1; i >= 0; i--) {
			System.out.print(day.charAt(i));
		}
		System.out.println();
		System.out.println("================================");
		/*
		 * find the value of a string at least 3 characters long and print the middle
		 * character
		 */

		Scanner input = new Scanner(System.in);
		String string1 = input.next();

		int mid = string1.length() / 2;
		if (string1.isEmpty() != true) {
			if (string1.length() % 2 != 0 && string1.length() >= 3) {
				System.out.println(string1.charAt(mid));
			}
		}
	}

}
