package com.class12;

public class StringManipulation3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "";

		System.out.println("Is this string empty? " + str.isEmpty());
// "\n" begins a new line in a string
		String str1 = "Each day has a promise to brighten up a day, \nBut first you must let the sun come to your day";
		System.out.println(str1);
		System.out.println("============================================");

//two ways to concatenate
		String str3 = "hello";
		String str4 = "world";
		System.out.println(str3 + " " + str4);
		System.out.println(str3.concat(" " + str4));

		System.out.println("====================================");

		String str5 = " How are you? ";
		System.out.println(str5.trim());

		String str6 = "We might be done early";
		System.out.println(str6.charAt(3));

		String str7 = "We might mnot be done early";
		System.out.println(str7.charAt(3));

		/*
		 * This method returns the index of a character in the first instance or returns
		 * "-1" if the character doesn't occur
		 */

		System.out.println(str7.indexOf('m'));
		System.out.println(str7.indexOf('m', 4)); //searches the index of 'M' starting from the 11th index
	}

}
