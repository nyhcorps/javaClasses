package com.class25;

public class Test {

	public static void main(String[] args) {
		System.out.println("Creat an object of an employee class");
		Employee emp = new Employee();
		emp.salary = 70000;
		Employee.companyName = "Syntax";
		emp.work();
		emp.getPaid();

		System.out.println("Creating an object of ScrumTeam class----");
		ScrumTeam sm = new ScrumTeam();
		sm.salary=90000;
		Employee.companyName="Syntax";
		emp.work();
		emp.getPaid();
		
		System.out.println("---Creating an object of a Developer class-----");
		Developer dev=new Developer();
		dev.salary=130000;
		dev.work();
		dev.getPaid();
		dev.code();
		dev.artifacts="Sprint Backlog";
		dev.ceremonies="Sprint Demo, Planning, Retro, Daily StandUp";
		dev.attendScrumMeetings();
		dev.employeeId=101;
		//dev.employeeSsn not accessible
	}

	
	

}
