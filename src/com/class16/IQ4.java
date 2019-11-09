package com.class16;

public class IQ4 {

	public static void main(String[] args) {
		/*
		 * How to find out the part of the string? What is a substring Find the number
		 * of words in string
		 */

		String str = "Today is very cold outside";
		String subString = str.substring(0, 5);
		System.out.println(subString);
		/*Step 1: split based on the space---array of string
		 * step 2: find the length of an array
		 *
		 */
		
		String[] words=str.split(" ");
		System.out.println(words.length);
	}

}
