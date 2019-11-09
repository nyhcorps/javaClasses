package com.class14;

public class Interview5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    
		 String reverseString = "";
	        String str = "Welcome to the java class";
	        char[] name = str.toCharArray();
	        for (int j = name.length-1 ; j >=0; j--) {
	            reverseString = reverseString + name[j];
	        }            
	        System.out.println(reverseString);
	        System.out.println("==========================");
	        
	       
	    	}
	    		
	}
	

