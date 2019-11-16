package com.class19;

public class Student {

	char getGrade(int num1) {
		char grade='0';
		if(num1>90) {
			grade='A';
		}else if(num1<=90 && num1>80) {
			grade='B';
		}else if(num1<=80 && num1>70) {
			grade='C';
		}else if(num1<=70 && num1>50) {
			grade='d';
		}else {
			grade='F';
		}
		return grade;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Student score=new Student();
		char grade=score.getGrade(75);
		System.out.println(grade);
	}

}
