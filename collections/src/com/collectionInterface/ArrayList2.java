package com.collectionInterface;

import java.util.*;

public class ArrayList2 {

	public static void main(String[] args) {

		ArrayList<Student> al = new ArrayList<>();

		al.add(new Student(1, "Raju"));
		al.add(new Student(2, "John"));
		al.add(new Student(3, "Smith"));
		al.add(new Student(4, "Rani"));

		ListIterator<Student> li = al.listIterator();

		while (li.hasNext()) {
			System.out.println(li.next());
		}

		System.out.println("=====================");

		while (li.hasPrevious()) {
			System.out.println(li.previous());
		}

	}

	
}
class Student {
	int id;
	String name;

	public Student(int id, String name) {

		this.id = id;
		this.name = name;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + "]";
	}

	

}

