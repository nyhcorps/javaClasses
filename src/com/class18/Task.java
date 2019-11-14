package com.class18;

public class Task {

	void largerThan(int num1, int num2) {
		if (num1 > num2) {
			System.out.println(num1);
		} else if (num1 == num2) {
			System.out.println("numbers are equal");
		} else {
			System.out.println(num2);
		}
	}

	void evenOrOdd(int num1) {
		if (num1 % 2 == 0) {
			System.out.println("Even");
		} else {
			System.out.println("Odd");
		}
	}

	void palindrome(String str) {
		String reverseStr = "";
		for (int i = str.length() - 1; i >= 0; i--) {

			reverseStr = reverseStr + str.charAt(i);
		}
		if (reverseStr.equals(str)) {
			System.out.println("Palindrome");
		}else {
			System.out.println("Not Palindrome");
		}
	}

	public static void main(String[] args) {
		Task num1 = new Task();

		num1.largerThan(5, 5);
		num1.evenOrOdd(5);
		Task str1 = new Task();
		str1.palindrome("mine");

	}
}
