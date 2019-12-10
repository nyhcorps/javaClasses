package com.class29;

public abstract class Vehicle {

	public void drive() {
		System.out.println("Vehicle can drive");
	}

	public void stop() {
		System.out.println("Vwhicle can stop");
	}

	public abstract void start();
}

abstract class Car extends Vehicle {
	public void speed() {
		System.out.println("Max car speed up to 400");
	}

	public abstract void breaking();
}

class BMW extends Car {

	@Override
	public void start() {
		System.out.println("BMW remot starts");
	}

	@Override
	public void breaking() {
		System.out.println("BMW can break");
	}

}