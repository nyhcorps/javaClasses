package com.class11;

public class Task {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String[] carsList= {"Acura","Nissan","Toyota","Ford","Cadillac","Tesla"};
	for(String make:carsList){
		System.out.println(make);
	}
	System.out.println("===================================================");
	
	for(int i=0; i<carsList.length; i++) {
		System.out.println(carsList[i]);
	}
	
	}

}
