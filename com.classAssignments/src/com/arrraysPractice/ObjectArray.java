package com.arrraysPractice;

import java.util.Arrays;

public class ObjectArray {

	public static void main(String[] args) {
		Object[] a = new Object[100];

		a[0] = new Student(101, "Raju");
		a[1] = new Student(102, "Rani");

		a[2] = new Employee(101, "Raju", 1000.00);
		a[3] = new Employee(102, "Rani", 2000.00);

		a[2] = new Customer(101, "Raju", 1000.00);
		a[3] = new Customer(102, "Rani", 2000.00);
	
		System.out.println(Arrays.toString(a));
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

class Employee {
	int id;
	String name;
	double salary;

	public Employee(int id, String name, double salary) {

		this.id = id;
		this.name = name;
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + "]";
	}
	

}

class Customer {
	int id;
	String name;
	double salary;

	public Customer(int id, String name, double salary) {
		
		this.id = id;
		this.name = name;
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Customer [id=" + id + ", name=" + name + ", salary=" + salary + "]";
	}

}