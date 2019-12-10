package com.class27;

public class Student {
 public void m1() {
	 System.out.println("Student needs to study");
 }
 public void m2() {
	 System.out.println("Student needs to do homework");
 }
 public void m3() {
	 System.out.println("Student needs to do research");
 }
 public void m4() {
	 System.out.println("Student needs to attend classes");
 }
}

 class SyntaxStudent extends Student{
	public void m1() {
		System.out.println("Syntax student needs to study alot");
	}
}
 class CollegeStudent extends Student{
	 
}
 class SchoolStudent extends Student{
	 
}
