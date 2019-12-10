package com.repl;

public class Main {
	public static void main(String[] args) {
		  Parent obj=new Parent ();
		  obj.display();
		}
		}
		class Parent{
		  protected void display() {
		    System.out.println("Protected method in parent class");
		  }
		}

		class Child extends Parent{
		  public void display() {
		    System.out.println("public method in parent class");
		  }
		}


			
			

