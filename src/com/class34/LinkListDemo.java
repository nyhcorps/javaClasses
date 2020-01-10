package com.class34;

import java.util.LinkedList;

public class LinkListDemo {

	public static void main(String[] args) {
		LinkedList<String> llist=new LinkedList<>();
		llist.add("Hello");
		llist.add("Bye");
		llist.add("Hello");
		llist.add("Bye");
		llist.add("How are you?");
		System.out.println(llist);
		
		llist.set(1, "Good bye");
		System.out.println(llist);
	}

}
