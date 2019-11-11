package com.class17;

public class Phone {

	String make, model;
	int year;
	boolean isOld;
	
	void about() {
		System.out.println("The "+model+" by "+make+" was released in "+year+". Is it old? "+isOld);
	}
	
}
