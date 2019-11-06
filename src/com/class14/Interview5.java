package com.class14;

public class Interview5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    
		 String reverseString = "";
	        String str = " hatem mahmoud numan";
	        char[] name = str.toCharArray();
	        for (int j = name.length-1 ; j >0; j--) {
	            reverseString = reverseString + name[j];
	        }            
	        System.out.println(reverseString);
	        System.out.println("==========================");
	        
	        String a=str;
	    	String[] array= a.split("\\s");
	    	
	    	
	    	for(String result:array) {
	    		for(int i=result.length()-1; i>0; i--) {
	    		System.out.println(result);
	    		}
	    	}
	    		
	}
	
}
