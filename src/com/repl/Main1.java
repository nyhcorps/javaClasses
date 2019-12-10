package com.repl;


public class Main1 {

	Main1(String str,String str2,int num1,int num2,double num3) {
		String make=str;
		   String model;
		   int numberOfDoors;
		   int topSpeed;
		   double price;
	  }
	  Main1(String make,String model,int topSpeed,double price) {
	    int numberOfDoors=4;
	  }
	  Main1(int numberOfDoors,int topSpeed,double price) {
	    String make="unknown";
	    String maodel="unknown";
	  }
	  Main1(String make,String model,int numberOfDoors) {
	    int topSpeed=90;
	    double price=0;
	    
	  }
		public static void main(String[] args) {
			Car obj1=new Car("Toyota","Prius",4,120,30000);
		obj1.display();	
			
		}

}
