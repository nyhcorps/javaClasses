package com.class17;

public class ObjectOfAComputerClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Computer comp1=new Computer();
		comp1.brand="apple";
		comp1.memory=256;
		comp1.keyboard=true;
		comp1.name="Macbook Pro";
		
		System.out.println("My computer is a "+comp1.name+" and it has "+comp1.memory+"GB of memory");
		

	}

}
