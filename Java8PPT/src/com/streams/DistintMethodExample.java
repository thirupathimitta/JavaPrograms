package com.streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import com.java8.collectionsenhancements.Employee;

public class DistintMethodExample {

	public static void main(String[] args) {
		
		List <Integer> l1 = Arrays.asList(1,2,3,4,5,1,2,3);
		
		
		int  duplicateCount = (int) (l1.size()- l1.stream().distinct().count());
		System.out.println(duplicateCount);
		
		
		
//		example2:- overridng hashcode and equlas method

		List<Employee> l = new ArrayList<>();
		l.add(new Employee("Thirupathi", 100, 150000.0));
		l.add(new Employee("vinay", 100, 120000.0));
		l.add(new Employee("vijay", 102, 110000.0));
		l.add(new Employee("albert", 103, 90000.0));
		l.add(new Employee("devid", 104, 60000.0));

		
		l.stream().distinct().forEach(System.out::println);
		
		//emxp3: - adding distint employees in Map 
		
		Map<Integer, Employee> distinctEmployees = l.stream().collect(Collectors.toMap(p->p.getEmpId(), p->p));
		System.out.println(distinctEmployees);
		

	}

}
