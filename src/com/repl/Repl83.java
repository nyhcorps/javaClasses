package com.repl;

public class Repl83 {

	public static void main(String[] args) {
		// Write a program to print the sum of the elements in the third row. 
		
			
		int[][] a = {
				{5,2,3,7},
				{1,5,2,2},
				{1,2,3,4}
			};
		int element = 0;
		for(int i=2; i<a.length; i++) {
			for(int j=0; j<=a.length; j++) {
			 element=element+a[i][j];
			}
		}System.out.println(element);
		
	}

}
