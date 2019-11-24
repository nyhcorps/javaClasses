package com.class20;

public class Task {

	String reversed(String str) {
		String result="";
		char[] charArray=str.toCharArray();
		for(int i=charArray.length-1; i<=0; i--) {
			result=result+charArray[i];
		}return result;
	}
	
	private int charAt(int i) {
		// TODO Auto-generated method stub
		return 0;
	}

	public static void main(String[] args) {
		/*
		 * Create a method that will take 1 parameter as a String and return reversed
		 * String. Method should be visibly only within same package. 
		 * 
		 * Create a method that will take a String and return whether String is palindrome or not.
		 * Method should be available to all classes within your projects. 
		 * 
		 * Create a method that will take a string and return an array of words from that string.
		 * Method should be available only within same class.
		 * 
		 */
		
		Task str1=new Task();
		String word=str1.reversed("Syntax");
		

	}

}
