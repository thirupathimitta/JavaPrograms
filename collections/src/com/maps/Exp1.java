package com.maps;

import java.util.*;

public class Exp1 {

	public static void main(String args[]) {
		// Creating an empty HashMap
		Map<String, Integer> hm = new HashMap<String, Integer>();

		// Inserting pairs in above Map
		// using put() method
		hm.put("a", 100);
		hm.put("b", 200);
		hm.put("c", 300);
		hm.put("d", 400);
		
		LinkedList l = new LinkedList();
		l.add(1);
		l.add(2);
		l.add(3);
		l.add(4);
		l.add(5);
		l.add("hi sujji");
		Integer i = 3;
		l.remove(i);
		l.remove("hi sujji");
		System.out.println(l);

		// Traversing through Map using for-each loop
		for (Map.Entry<String, Integer> me : hm.entrySet()) {

			// Printing keys
			System.out.print(me.getKey() + ":");
			System.out.println(me.getValue());
		}
		
		for(String keys:hm.keySet())
		{
			
			System.out.print(keys+" ");
		}
		for(Integer value:hm.values())
		{
			
			System.out.print(value+" ");
		}

	}

}
