package com.repl;

public class Repl121 {
		

	char getChar(String word, int index) {
		char[] array1=word.toCharArray();
		char getChar=array1[index];
		return getChar;
	}

	public static void main(String [] args) {
	  Repl121 str=new Repl121();
	  System.out.println(str.getChar("hello",1));
	}
}
