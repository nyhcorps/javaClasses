package com.class16;

public class IQ6 {

	public static void main(String[] args) {
		/*
		 * 
		 */

		String original="kayak";
		String reversed="";
		
		for(int i=original.length()-1; i>=0; i--) {
			reversed=reversed+original.charAt(i);
		}
		System.out.println(reversed);
		if(original.equals(reversed)) {
			System.out.println("String is palindrome");
		}else {
			System.out.println("String is not palindrome");
		}
	}

}
