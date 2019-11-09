package com.class15;

import java.util.Scanner;

public class StringManipulationsTask {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan=new Scanner(System.in);
		System.out.println("Please enter browser name");
		String browser=scan.nextLine();
		
		switch(browser.toLowerCase()) {
		case "firefox":
			System.out.println("Exexcution be performed on "+browser);
			break;
		case "ie":
			System.out.println("Exexcution be performed on "+browser);
			break;
		case "chrome":
			System.out.println("Exexcution be performed on "+browser);
			break;
		case "safari":
			System.out.println("Exexcution be performed on "+browser);
			break;
			default:
				System.out.println("Please enter valid browser");
		}
		
	}

}
