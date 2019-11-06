package com.repl;

public class Repl86 {

	public static void main(String[] args) {
		// Write a program that takes a 2-D array and prints the sums of the rows as an
		// integer array.

		int[][] a = { { 1, 1, 2 }, // sum = 4
				{ 3, 1, 2 }, // sum = 6
				{ 3, 5, 3 }, // sum = 11
				{ 0, 1, 2 } // sum = 3
		};
		int total = 0;
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a.length-1; j++) {
				total = total + a[i][j];
				
			}
		}System.out.println(total);
		
	}

}
