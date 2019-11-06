package com.class14;

public class InterviewQuestion3 {

	public static void main(String[] args) {
		// Find out how many alpha characters present in a string?
		String str1="Hello, how are you?";
		String str2=str1.replaceAll("[^A-z]", "");

		char[] array1=str2.toCharArray();
		
		System.out.println(array1.length);
	}

}
