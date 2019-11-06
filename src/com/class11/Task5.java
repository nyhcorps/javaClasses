package com.class11;

public class Task5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int[][] num= {{6,10,15,23},{25,29,33,34},{62,63,66,72}};

int sum=0;
for(int i=0; i<num.length; i++) {
	for(int j=0; j<num[0].length; j++) {
	sum=sum+num[i][j];
	}System.out.println();
	
}System.out.println("THe sum of all elements in the array is:"+sum);
	}

}
