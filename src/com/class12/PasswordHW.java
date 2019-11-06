package com.class12;

import java.util.Scanner;

public class PasswordHW {

	public static void main(String[] args) {
		/*
		 * Accept username, password and confirm password and check following
		 * requirements: Username and Password cannot be empty, if so→ message=“Username
		 * and Password cannot be empty”. Password should be minimum 8 characters, if
		 * less → message=“Password is too short”. Password cannot contain username if
		 * so, → message=“Password cannot contain username”. Password should match
		 * confirmed password, if not → message=“Passwords do not match”. Only after all
		 * requirements met → message “Your username and password has been created”
		 */
		Scanner input = new Scanner(System.in);
		String username = input.nextLine();
		String password = input.nextLine();
		
		if(username.isEmpty() || password.isEmpty()) {
			System.out.println("Username and password cannot be empty");
		}else if(password.contains(username)) {
			System.out.println("Password cannot contain username");
		}else  if(password.length()<8) {
			System.out.println("Password is too short");
		}
	}

}
