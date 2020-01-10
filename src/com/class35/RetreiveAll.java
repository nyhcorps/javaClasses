package com.class35;

import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class RetreiveAll {

	public static void main(String[] args) {
		
		Map<String, String> personMap=new LinkedHashMap<>();
		personMap.put("Name", "Ahmet");
		personMap.put("LastName", "Yildiz");
		personMap.put("Address", "123 Test");
		personMap.put("City", "Dallas");
		personMap.put("State", "TX");
		
		System.out.println(personMap);
		
		//how to retrieve
		String value=personMap.get("State");
		System.out.println(value);
		
		//how to retrieve all values
		System.out.println("====================Print All Keys====================");
		Set<String> keys=personMap.keySet();
		
		for(String key: keys) {
			System.out.println(key);
		}
		
		Iterator<String> keysIterator=keys.iterator();
		while(keysIterator.hasNext()) {
			System.out.println(keysIterator.next());
		}
		System.out.println("====================Print All Values====================");
		Collection<String> values=personMap.values();
		
		for(String val: values) {
			System.out.println(val);
		}
		
		Iterator<String> valuesIterator=values.iterator();
	}

}
