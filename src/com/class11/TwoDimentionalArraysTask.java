package com.class11;

public class TwoDimentionalArraysTask {

	public static void main(String[] args) {
		//Task: create 2D array of string with 2 rows and 3 columns
		
		String[][] array=new String [2][3];
		
		array[0][0]="a";
		array[0][1]="v";
		array[0][2]="c";
		
		array[1][0]="j";
		array[1][1]="l";
		array[1][2]="d";
		
		System.out.println(array[1][2]);
		
		//
		int[][] numList= {{8,7,5,3,8},{1,5,6,4,9},{3,6,8,0,7}};
		//To Identify the numbers of rows
		System.out.println("The numbers of the rowa are: "+numList.length);
		//To identify the numbers of columns/elements in that row
		System.out.println("The numbers in the columns are: "+numList[1].length);
		for(int i=0; i<numList.length; i++) {
			for(int j=0; j<numList[i].length; j++);
			System.out.print(numList[i][1]+" ");
		}
	}

}
