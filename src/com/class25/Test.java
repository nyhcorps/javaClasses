package com.class25;

public class Test {

	public static void main(String[] args) {
		System.out.println("Creat an object of an employee class");
		Employee emp = new Employee();
		emp.salary = 70000;
		Employee.companyName = "Syntax";
		emp.work();
		emp.getPaid();

		System.out.println("Creating an object of");
	}

	ScrumTeam sm = new ScrumTeam();

}
