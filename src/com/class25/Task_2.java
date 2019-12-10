package com.class25;

public class Task_2 {

	static void m1(int num) {
		System.out.println("I have an interger: "+num);
	}
	static void m1(int num, int num2) {
		System.out.println("I have two intergers: "+num+";"+num2);
	}
	static void m1(String str) {
		System.out.println("I have a String: "+str);
	}
	
	public static void main(String[] args) {
		Task_2 obj=new Task_2();
		obj.m1(5);
		obj.m1(3, 2);
		obj.m1("hello");
	}

}
