package com.streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import com.java8.collectionsenhancements.Employee;

public class FilterExpample1 {

	public static void main(String[] args) {

		List<Employee> l = new ArrayList<>();
		l.add(new Employee("Thirupathi", 100, 150000.0));
		l.add(new Employee("vinay", 101, 120000.0));
		l.add(new Employee("vijay", 102, 110000.0));
		l.add(new Employee("albert", 103, 90000.0));
		l.add(new Employee("devid", 104, 60000.0));

		// WAP to print the employee whose name starts with "v" without java8

		for (int i = 0; i < l.size(); i++) {
			if (validName(l.get(i).getEmpName())) {
				System.out.println(l.get(i).getEmpName());
			}
		}

		
		//with java8
		l.stream().filter(e->e.getEmpName().startsWith("v")).forEach(i->System.out.println(i.getEmpName()));
		
		
		
	       

	       
	}

	private static boolean validName(String s) {
		if (s.startsWith("v")) {
			return true;
		}
		return false;
	}

}
