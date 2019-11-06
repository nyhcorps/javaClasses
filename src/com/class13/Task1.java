package com.class13;

import java.util.Scanner;

public class Task1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter your class day:: ");
		String day = scanner.nextLine();
		if (day.equals("Saturday")) {
			System.out.println("Saturday is your Java class");
		} else if (day.equals("Sunday")) {
			System.out.println("Sunday is your Git class");
		} else if (day.equals("Tuesday")) {
			System.out.println("Tuesday is your SDLC class");
		} else if (day.equals("Thursday")) {
			System.out.println("Thursday is your SDLC class");
		}else {
			System.err.println("invalid entry!!! Enter a valid class day");
		}
	}
}
