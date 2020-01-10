package com.class35;

import java.util.HashMap;

public class MapIntro {

	public static void main(String[] args) {
		HashMap<Integer, String> map=new HashMap<>();
		//to store key+value pair into map
		map.put(101, "John");
		map.put(102, "Jack");
		map.put(103, "Jane");
		map.put(104, "Jenny");
		
		System.out.println(map);
		//how to verify if there any elements inside map
		boolean flag=map.isEmpty();
		if(!flag) {
			int size=map.size();
			System.out.println(size);
		}
		//I want to add more entries
		//map.put(105,"John")-->CE: key and value type must be matched
		//adding duplicate values-->ok
		map.put(105, "John");
		System.out.println(map);
		//adding duplicate keys-->override, we can not have duplicate keys
		map.put(102, "Hasan");
		System.out.println(map);
		//how to access a value
		String mapElement=map.get(105);
		System.out.println(mapElement);
		
		//to replace or update the value
		map.replace(103, "Zeynep");
		System.out.println(map);
		
		//how to remove an object
		map.remove(105);
		System.out.println(map);
		
		}
		
	}
	
	
	

