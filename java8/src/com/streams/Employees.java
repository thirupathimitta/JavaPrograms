package com.streams;

public class Employees {
	int id;
	String name;
	int age;
	String gender;
	String Department;
	int yearOfJoin;
	Double salary;
	
	public Employees(int id, String name, int age, String gender, String department, int yearOfJoin, double salary) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
		this.gender = gender;
		Department = department;
		this.yearOfJoin = yearOfJoin;
		this.salary = salary;
	}
	

	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public int getAge() {
		return age;
	}


	public void setAge(int age) {
		this.age = age;
	}


	public String getGender() {
		return gender;
	}


	public void setGender(String gender) {
		this.gender = gender;
	}


	public String getDepartment() {
		return Department;
	}


	public void setDepartment(String department) {
		Department = department;
	}


	public int getYearOfJoin() {
		return yearOfJoin;
	}


	public void setYearOfJoin(int yearOfJoin) {
		this.yearOfJoin = yearOfJoin;
	}


	public Double getSalary() {
		return salary;
	}


	public void setSalary(Double salary) {
		this.salary = salary;
	}


	@Override
	public String toString() {
		return "Employees [id=" + id + ", name=" + name + ", age=" + age + ", gender=" + gender + ", Department="
				+ Department + ", yearOfJoin=" + yearOfJoin + ", salary=" + salary + "]";
	}
	
	
	

}
