package com.functionalinterface;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.function.BiFunction;

public class ComparableLambdaExample {
	public static void main(String[] args) {	
		List<Student> students = new ArrayList<>();	
		BiFunction<Integer,String,Student> f = (id,name)-> new Student(id,name);	
		students.add(f.apply(101,"Allice"));
		students.add(f.apply(102,"Bob"));
		students.add(f.apply(103,"charlie"));
		Collections.sort(students);
		students.forEach(student -> System.out.println("ID: " + student.getId() + ", Name: " + student.getName()));
	}
}
