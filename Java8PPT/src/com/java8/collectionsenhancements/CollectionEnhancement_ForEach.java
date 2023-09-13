package com.java8.collectionsenhancements;

import java.util.ArrayList;
import java.util.List;

public class CollectionEnhancement_ForEach {

	public static void main(String[] args) {
		List<Integer> l = new ArrayList<>();
		l.add(10);
		l.add(11);
		l.add(32);
		l.add(23);
		
		System.out.println("printing data from collection object  without java8 ");
		
		for(int i=0;i<l.size();i++) {
			System.out.println(l.get(i));
		}
		
		System.out.println("printing data from collection object  with java8 ");	
		
		l.forEach(i->System.out.println(i));  //consumer interface

	}

}
