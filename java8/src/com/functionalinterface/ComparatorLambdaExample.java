package com.functionalinterface;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.function.BiFunction;

interface MethodReferance {
	void m1(int Id);
}
class Student1 {
	private int id;
	private String name;

	public Student1(int id, String name) {
		this.id = id;
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	static void method(int id) {
		System.out.println("using method refernace getting student id " + id);
	}
}
public class ComparatorLambdaExample {
	public static void main(String[] args) {
		List<Student1> students = new ArrayList<>();
		BiFunction<Integer, String, Student1> f = (id, name) -> new Student1(id, name); //contructor Referance
		students.add(f.apply(102, "Bob"));
		students.add(f.apply(101, "Allice"));
		students.add(f.apply(104, "ice"));
		students.add(f.apply(107, "llice"));
		students.add(f.apply(103, "charlie"));
		MethodReferance mm = Student1::method; //Method referance
		students.forEach(student1 -> mm.m1(student1.getId())); //lambda expressions
		Collections.sort(students, (s1, s2) -> (s1.getId() > s2.getId()) ? 1 : (s1.getId() < s2.getId()) ? -1 : 0);//comparaToMethod
		students.forEach(student1 -> System.out.println("ID: " + student1.getId() + ", Name: " + student1.getName()));
	}
}
