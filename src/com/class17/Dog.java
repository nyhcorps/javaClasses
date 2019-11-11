package com.class17;

public class Dog {

	String size,breed;
	int weight, age;
	
	
	void eats() {
		System.out.println("My "+breed+" eats. It weighs "+weight+" pounds, it is "+size+".");
	}
	
	void houseBroken() {
		System.out.println("My "+breed+" is housebroken.");
	}
	
	void age() {
		System.out.println("My "+breed+" is "+age+" years old.");
	}
}
