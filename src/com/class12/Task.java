package com.class12;

public class Task {

	public static void main(String[] args) {
		String sen1, sen2;

		sen1 = "How is the weather today";
		sen2 = "It is very sunny today";

		System.out.println("The length of sen 1 is " + sen1.length());
		System.out.println("Does sentence 1 equal senence 2? " + sen1.equals(sen2));
		System.out.println("Sentence 2 contains the word sunny " + sen2.contains("sunny"));
		sen1=sen1.toUpperCase();
		System.out.println(sen1);
		sen2=sen2.toLowerCase();
		System.out.println(sen2);
		System.out.println(sen1.equalsIgnoreCase("how is the weather today"));

		
		String str1="It is ver hot in this class";
		System.out.println("Is this string start with "+str1.startsWith("It"));
		System.out.println("Is this string ends with "+str1.endsWith("class"));
	}

	

}
