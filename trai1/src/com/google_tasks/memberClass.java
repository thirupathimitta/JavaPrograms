package com.google_tasks;

public class memberClass {
	String name;
	int age;
	String pNumber;
	String address;
	double salary;
	void printSalary() {
		System.out.println(name +"\t"+ salary);
	}
	double printSalary(double salary) {
		this.salary =salary;
		return salary;
	}

}
