package com.class11;

public class Task4 {

	public static void main(String[] args) {
		/*
		 * Create an array of countries. While retrieving all values from an array print
		 * capital for each country. (use 2 different loops).
		 */

		String[] countries= {"United States","Canada","Spain","Haiti"};
		String capital;
		for(int i=0; i<countries.length; i++) {
			switch(countries[i]) {
			case "United States":
				capital="DC";
				break;
			case "Canada":
				capital="Ottawa";
				break;
			case "Spain":
				capital="Madrid";
				break;
			case "Haiti":
				capital="Port Au Prince";
				break;
				
			}
		}
	}

}
