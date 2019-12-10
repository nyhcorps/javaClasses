package com.class28;

public class UserInfo extends User {
String address;
	UserInfo(String address, String name, int mobile) {
		super(name, mobile);
		this.address=address;
	}
	public void userDetails() {
		System.out.println("Address is: "+address+". Name is: "+name+". Cell number is: "+mobile);
	}
	

}
