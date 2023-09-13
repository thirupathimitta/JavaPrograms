package com.java8.collectionsenhancements;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CollectionEnhancement_ForEach2 {
	public static void main(String[] args) {

		List<Employee> l = new ArrayList<>();
		l.add(new Employee("Thirupathi", 100, 150000.0));
		l.add(new Employee("vinay", 101, 120000.0));
		l.add(new Employee("vijay", 102, 110000.0));
		l.add(new Employee("albert", 103, 90000.0));
		l.add(new Employee("devid", 104, 60000.0));

		System.out.println("printing data from collection object  without java8 ");

		for (int i = 0; i < l.size(); i++) {
			System.out.println("empname ->" + l.get(i).empName + ", empId-> " + l.get(i).empId + ", empSalary -> "
					+ l.get(i).getSalary());
		}
		System.out.println("====================================================================");

		System.out.println("printing data from collection object  with java8 ");
		
		l.forEach(i -> System.out
				.println("empname ->" + i.empName + ", empId-> " + i.empId + ", empSalary -> " + i.getSalary()));

		System.out.println("--------------------Nested Foreach-------------");

		List<List<Integer>> nestedLists = Arrays.asList(Arrays.asList(1, 2, 3), Arrays.asList(4, 5, 6),
				Arrays.asList(7, 8, 9));

		nestedLists.forEach(innerList -> {
			innerList.forEach(number -> System.out.print(number + " "));
			System.out.println();
		});

	}

}
