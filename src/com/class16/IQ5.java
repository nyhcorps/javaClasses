package com.class16;

public class IQ5 {

	public static void main(String[] args) {
		/*
		 * Write a java program t reverse String
		 * reverse string by word
		 */

		String given="Welcome to the Java class";
		/*to reverse string
		 * step 1: split--->array aof string
		 * step2: use "for "loop and decrement to pring values
		 */
		
		String reversed="";
		String[] str=given.split("\\s");
		for(int j=str.length-1; j>=0; j--) {
			reversed=reversed+str[j]+" ";
			
		}
		System.out.print(reversed);
		
	}

}
