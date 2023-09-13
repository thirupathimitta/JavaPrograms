package com.streams;

import java.util.ArrayList;
import java.util.List;

public class MapDemo {
	
	interface TriFunction<A, B, C, R> {
	    R apply(A a, B b, C c);
	}
	public static void main(String[] args) {
	
		TriFunction<String, Integer, Double, Employee> employee = (name,age,salary) -> new Employee(name,age, salary);
		List<Employee> l = new ArrayList();

		l.add(employee.apply("thiru", 27, 150000.0));
		l.add(employee.apply("jhon", 28, 40000.0));
		l.add(employee.apply("devid", 37, 560000.0));
		l.add(employee.apply("raj", 47, 910000.0));
		l.add(employee.apply("suresh", 17, 12000.0));
		l.add(employee.apply("ramesh", 57, 20000.0));
		l.stream().filter(emp -> emp.salary > 50000).map(emp -> emp.age).forEach(System.out::println);
		l.stream().filter(emp -> emp.salary > 50000).forEach(emp -> System.out.println(emp.name + "--" + emp.age));

	}
}
