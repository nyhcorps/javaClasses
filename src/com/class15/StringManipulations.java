package com.class15;

public class StringManipulations {

	public static void main(String[] args) {
		//String class comes in java lang package
		
		//2 ways to create a string
		//1.String liertal
		String str="Hello";
		//2. using new keyword creating a string object
		String str1=new String("Hello");
		//case conversion methods/functions
		System.out.println(str.toLowerCase());//hello
		System.out.println(str);//Hello
		
		//verify if the string is empty
		String myString="";
		boolean isEmpty=myString.isEmpty();
		String myString1=null;//no value at all it it equal to
		//String MyString1;
		//System.out.println(myString1.isEmpty());
		
		//how to verify existance of characters  in the string
		String a="Good Evening students";
		boolean exist=a.contains("students");
		System.out.println(exist);
				
		System.out.println(a.startsWith("Good"));
		System.out.println(a.endsWith("student"));

	}

}
