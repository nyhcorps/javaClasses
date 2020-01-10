package com.class35;

import java.util.HashMap;

public class Task1 {

	public static void main(String[] args) {
		HashMap<Integer, String> building=new HashMap<>();
		building.put(1, "Google");
		building.put(2, "Syntax");
		building.put(3, "Syntax");
		building.put(4, "Syntax");
		building.put(5, "CACI");
		building.put(6, "CACI");
		building.put(6, "Jacobs");
		building.put(7, "TekSystems");
		
		int size=building.size();
		System.out.println(size);
		building.replace(4, "NCI");
		building.remove(7);
		System.out.println(building);
	}

}
