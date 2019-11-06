package com.class10;

public class Task {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char[] grades = new char[5];
		grades[0] = 'A';
		grades[1] = 'B';
		grades[2] = 'C';
		grades[3] = 'D';
		grades[4] = 'F';

		System.out.println(grades[1]);

		char[] grade = { 'A', 'B', 'C', 'D', 'F' };

		System.out.println(grade[1]);

		System.out.println("=========================================");

		String[] names = { "Kevin", "Hatem", "Nouna", "Mussarat", "Mohammed" };
		System.out.println(names[0]);

		String[] names2 = new String[5];
		names2[0] = "Kevin";
		names2[1] = "Hatem";
		names2[2] = "Nouna";
		names2[3] = "Mussarat";
		names2[4] = "Mohammed";
		System.out.println(names2[0]);

		System.out.println("=============================================");

		String[] random = { "Saturday", "Java", "day", "coding", "is" };
		System.out.println(random[0] + " " + random[4] + " " + random[1] + " " + random[3] + " " + random[2]);

		System.out.println("=======================================================");

		String[] animals = { "Cat", "Dog", "Cow", "Snake", "elephant" };
		int size = animals.length;

		for (int i = 0; i < size; i++) {
			System.out.print(animals[i] + " ");

						
			}
		System.out.println();
		
		double[] d1 = { 2.5, 3.2, 5.5, 4.3, 6.7 };
		int d1Size = d1.length;
		for (int a = 0; a < d1Size; a++) {
			System.out.print(d1[a] + " ");
		}
	}

}
