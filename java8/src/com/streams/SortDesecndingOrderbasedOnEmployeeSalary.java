package com.streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class SortDesecndingOrderbasedOnEmployeeSalary {

	public static void main(String[] args) {

		List<Employee1> employees = Arrays.asList(new Employee1(1, 25000), new Employee1(2, 5000), new Employee1(3, 45000),
				new Employee1(4, 65000),new Employee1(5,15000));
		List<Employee1> orderedEmployees = employees.stream().sorted((e1,e2)->(int)(e2.getSalary()-e1.getSalary())).collect(Collectors.toList());
		System.out.println(orderedEmployees);
	}

}

class Employee1 {
	int Id;
	long salary;

	public Employee1(int id, long salary) {

		Id = id;
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Employee1 [Id=" + Id + ", salary=" + salary + "]";
	}

	public int getId() {
		return Id;
	}

	public void setId(int id) {
		Id = id;
	}

	public long getSalary() {
		return salary;
	}

	public void setSalary(long salary) {
		this.salary = salary;
	}

}