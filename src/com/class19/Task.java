package com.class19;

public class Task {

	String createEmail(String name, String surname, String emailType) {
		String email ="";

		switch (emailType) {
		case "gmail":
			email = name + surname + "@gmail.com";
			break;
		case "yahoo":
			email = name + surname + "@yahoo.com";
			break;
			
		}
		return email;
		
	}
	
		boolean primeOrNot(int num1) {
		boolean isPrime=false;
		
		if(num1%2==0 || num1%3==0 || num1%5==0 || num1%7==0) {
			if(num1==2 || num1==3 || num1==5 || num1==7) {
				isPrime=true;
			}else {
				isPrime=false;
			}
		}else {
			isPrime=true;
		}
		return isPrime;
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Task obj=new Task();
		
		String str=obj.createEmail("kevin", "sanchez", "gmail");
		System.out.println(str);
		
		Task obj2=new Task();
		boolean primeNum=obj2.primeOrNot(33);
		System.out.println(primeNum);
	}

}
