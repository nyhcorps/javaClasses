package com.class14;

public class TaskPart1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str1="How are you today?";
		
		String str2=str1.replaceAll(" ", "");
		
	System.out.println(str2);
	System.out.println("=========================");
	
	
	String combo="$S!atur%da&y";
	String combo2=combo.replaceAll("[^A-z]", "");
	
	char[] array1=combo2.toCharArray();
	System.out.println(array1.length);
	System.out.println(combo2);
	System.out.println("=============================");
	
	String a="Is it Saturday? Is it raining? Do we have Java class today?";
	String[] array= a.split("\\?");
	System.out.println(array.length);
	
	for(String result:array) {
		System.out.println(result.trim());
	}
	

	
	}

}
