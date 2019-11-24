package com.repl;

public class Repl115 {
	void sum(int num1,int num2){
		  System.out.println(num1+num2);
		}
		void product(int num1,int num2){
		  System.out.println(num1*num2);
		}
		void difference(int num1, int num2){
		  if(num1>num2){
		  System.out.println(num1-num2);
		  }else{
		  System.out.println(num2-num1);
		  }
		}
		public static void main(String[] args) {
		  Repl115 numbers=new Repl115();
		  numbers.sum(15,15);
		  numbers.product(6,5);
		  numbers.difference(30,10);
		}
}
