package com.class10;

public class ArrayDemo {

	public static void main(String[] args) {
		// to find number of elements use ".length"
		
		int[] nums=new int[4];
		nums[0]=12;
		nums[1]=13;
		nums[2]=14;
		nums[3]=15;
		System.out.println(nums.length);
		
		String[] array= {"wninter", "Fall", "Summer", "winter"};
		//I was born in summer
		System.out.println("I was born in "+array[2]);
		//array.length will return an integer
		int arraySize=array.length;
		System.out.println(arraySize);

	}

}
