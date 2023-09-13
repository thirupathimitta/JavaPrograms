package com.java8.collectionsenhancements;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class CollectionEnhancement_removeIf {

	public static void main(String[] args) {
		List<Employee> l = new ArrayList<>();
		l.add(new Employee("Thirupathi", 100, 150000.0));
		l.add(new Employee("vinay", 101, 120000.0));
		l.add(new Employee("vijay", 102, 110000.0));
		l.add(new Employee("albert", 103, 90000.0));
		l.add(new Employee("devid", 104, 60000.0));

//		Iterator<Employee> itr = l.iterator();
//		while (itr.hasNext()) {
//			Employee e = itr.next(); 
//			 l.add(new Employee("abc", 105, 2400.8)); itr.remove();
//
//			System.out.println(e);
//		}

	

		// removeif()

		l.removeIf(p -> p.getSalary() < 100000);

		l.forEach(System.out::println);
	}
}
