package com.class23;

public class Task {

	public static String state;
	public String city;
	public String streetName;
	public int houseNumber;

	Task(String cityAddr, String streetNameAddr, int houseNumberAddr) {

		state = "DE";
		city = cityAddr;
		streetName = streetNameAddr;
		houseNumber = houseNumberAddr;
	}

	protected Task() {

	}

	private Task(String carMake, String carModel) {

	}

	public void getAdd() {
		System.out.println("My address is " + houseNumber + " " + streetName + ", " + city + ", " + state);
	}

	public static void main(String[] args) {
		Task obj = new Task("Dover", "Pear St", 609);
		obj.getAdd();

		Task obj1 = new Task("Fredricka", "Mckillens Poand Rd", 120);
		obj1.getAdd();
	}

}
