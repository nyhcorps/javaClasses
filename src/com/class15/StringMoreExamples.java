package com.class15;

public class StringMoreExamples {

	public static void main(String[] args) {
		//get a character specific location
		String str="Syntax Technologies";
		
		char letter=str.charAt(5);
		System.out.println(letter);
		
		System.out.println(str.charAt(str.length()-1));
		
		//get a substring
		String subStr1=str.substring(0, 6);
		System.out.println(subStr1);
		String subStr2=str.substring(7);
		System.out.println(subStr2);
	}

}
