package com.class25;

public class Programming {

	void java() {
		System.out.println("I love programming languages");
	}

	void java(String str) {
		System.out.println("I love " + str);
	}

	public static void main(String[] args) {
		Programming obj = new Programming();
		obj.java();
		obj.java("Java");
	}

}
