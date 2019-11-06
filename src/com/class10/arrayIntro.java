package com.class10;

public class arrayIntro {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a;
		a = 10;

		int a1 = 10;

		int[] b;// declare an array-->preferred way
		int c[];

		b = new int[4];// initialized
		// 2nd way--> allin 1 line(declaration & initialization)
		int[] array = new int[4];
		array[0] = 10;
		array[1] = 20;
		array[2] = 30;
		array[3] = 40;
		// access values from array
		System.out.println(array[2]);

		// lets create an array the will store classes

		String[] classes = new String[4];
		classes[0] = "Java";
		classes[1] = "SDLC";
		classes[2] = "Manual testing";
		classes[3] = "GIT";
		System.out.println("Today we have " + classes[0] + " class");

		int[] nums = new int[3];
		nums[0] = 1;
		nums[1] = 2;
		nums[2] = 3;

		// change 1 to 100
		nums[0] = 100;

		String[] names = new String[3];
		names[0] = "Diana";
		names[1] = "Seda";
		names[2] = "Jaime";
		// names[3]="Olga"; during runtime we will get an exception
		// ArrayIndexOutOfBoundsException
		System.out.println(names[2]);
		
		/*When we use less values
		 * -->compiler will give default values
		 */
	}

}
