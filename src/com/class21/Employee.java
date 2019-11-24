package com.class21;

public class Employee {

	String eID;
	int salary;
	static String ceo;
	
	void printInfo() {
		System.out.println("eID is: "+eID);
		System.out.println("Salary is: "+salary);
		System.out.println("CEO is: "+ceo);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Employee emp1=new Employee();
		emp1.eID="ksanche";
		emp1.salary=85000;
		Employee.ceo="Sumair";
		
		Employee emp2=new Employee();
		emp2.eID="JMJohnso";
		emp2.salary=120000;
		
		Employee emp3=new Employee();
		emp3.eID="KSBenson";
		emp3.salary=90000;
		
		emp1.printInfo();
		System.out.println();
		emp2.printInfo();
		System.out.println();
		emp3.printInfo();
		
		
		
	}

}
