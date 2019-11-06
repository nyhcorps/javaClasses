package com.class10;

public class ConditionalArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String[] animals = { "Cat", "Dog", "Cow", "Snake", "elephant" };
		for(int i=0; i<animals.length; i++) {
			
			if(animals[i].equals("Dog")) {
				System.out.println("I love dogs");
			}else {
				System.out.println(animals[i]);
			}
			
		}
	}

}
