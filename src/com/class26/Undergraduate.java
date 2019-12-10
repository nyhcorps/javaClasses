package com.class26;

public class Undergraduate extends Degree {
	public void getDegree() {
		System.out.println("I am an Undergraduate.");
	}
	public static void main(String[] args) {
		Undergraduate obj=new Undergraduate();
		obj.getDegree();
		

	}

}
