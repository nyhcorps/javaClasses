package com.class12;

public class StringManipulationDemo {

	public static void main(String[] args) {
		// two ways to create a String method
		// 1.String Literal
		String name = "Jhon";
		System.out.println(name);
		System.out.println(name.length());

		// 2.creating with new keyword
		String name1 = new String("John");
		System.out.println(name1);

		/*
		 * This method returns the length of the string. The length is equal to the
		 * number of Unicode characters in the string
		 */
		int name1Len = name.length();
		System.out.println(name1Len);
		System.out.println("The length of name1 is: " + name1Len);

		System.out.println("============================");

		String str1 = "HelLo WoRLd";
		System.out.println("Before: " + str1);
		str1 = str1.toLowerCase();
		System.out.println("After: " + str1);
		System.out.println("============================");

		// .equals
		String str2 = "HelLo WoRLd";
		boolean isEquals = str1.equals(str2);
		System.out.println(isEquals);
		// .equals ignores case
		System.out.println(str1.equalsIgnoreCase(str2));

		System.out.println("===============================");
		
		// changes everything to upper case
		String str3 = "HelLo WoRLd";
		System.out.println("Before: " + str3);
		str3 = str3.toUpperCase();
		System.out.println("After: " + str3);

	}

}
