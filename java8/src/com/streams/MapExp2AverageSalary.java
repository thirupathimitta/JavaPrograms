package com.streams;

import java.util.Arrays;
import java.util.List;

public class MapExp2AverageSalary {
	interface TriFunction<A, B, C, R> {
	    R apply(A a, B b, C c);
	}
	public static void main(String[] args) {
		TriFunction<String, Integer, Double, Emp> e = Emp::new;
		List<Emp> numbers = Arrays.asList(e.apply("thiru", 27, 550000.0), e.apply("vijay", 29, 10000.0),
				e.apply("ram", 26, 45000.0), e.apply("devid", 30, 45000.0));

		
		double average = numbers.stream().mapToDouble(emp -> emp.salary).average().getAsDouble();

		System.out.println("Average: " + average); 

	}

}

class Emp {
	String name;
	int age;
	Double salary;

	public Emp(String name, int age, Double salary) {
		this.name = name;
		this.age = age;
		this.salary = salary;
	}

}