package com.class21;

	

public class Students {

	public String studentName;
	public int studentID;
	public static int numberOfStudents;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Students student1=new Students();
		student1.studentName="Kevin";
		student1.studentID=001;
		Students.numberOfStudents=1;
		Students student2=new Students();
		student2.studentName="Ali";
		student2.studentID=002;
		Students.numberOfStudents++;
		Students student3=new Students();
		student3.studentName="Jim";
		student3.studentID=003;
		Students.numberOfStudents++;
		
		System.out.println("The total number of students is: "+student1.numberOfStudents);
	}

}
