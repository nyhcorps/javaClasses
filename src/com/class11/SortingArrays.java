package com.class11;

import java.util.Arrays;

public class SortingArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] actualNames= {"John", "Mark", "Alex", "Tanaz"};
		String[] expectedNames= {"John","Tanaz","Alex","Mark"};
		
		Arrays.sort(actualNames);
		Arrays.sort(expectedNames);
		
		 System.out.println(Arrays.toString(actualNames));
	        
	        String actual=Arrays.toString(actualNames);
	        String expected=Arrays.toString(expectedNames);
	        
	        System.out.println(actual.equals(expected));
	        
	        int[] numbers= {123,34,15,66,99};
	        
	        for(int i:numbers) {
	            System.out.print(i+" ");
	        }
	        
	        System.out.println();
	        System.out.println("*******");
	        
	        
	        Arrays.sort(numbers);
	        for(int i:numbers) {
	            System.out.print(i+" ");
	        }

	}

}
