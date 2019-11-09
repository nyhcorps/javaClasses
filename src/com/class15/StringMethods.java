package com.class15;

public class StringMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="Java classes at Syntax are awesome";
		str=str.replace("awesome", "great");
		str=str.replace("a", "AA1111#$%");
		System.out.println(str);
		//replaceAll-->specify regular expressiom
		//lets remove all special characters
		str=str.replaceAll("[^a-zA-Z0-9]", "");
		System.out.println(str);
		
		//split
		String myString="Java classes at Syntax are Awesome";
		String[] array=myString.split("a");
		System.out.println(array.length);
	}

}
