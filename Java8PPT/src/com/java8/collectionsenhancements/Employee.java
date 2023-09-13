package com.java8.collectionsenhancements;

public class Employee {

	String empName;
	int empId;
	Double salary;

	public Employee(String empName, int empId, Double salary) {

		this.empName = empName;
		this.empId = empId;
		this.salary = salary;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public Double getSalary() {
		return salary;
	}

	public void setSalary(Double salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Employee [empName=" + empName + ", empId=" + empId + ", salary=" + salary + "]";
	}

	/*
	 * @Override public int hashCode() { // TODO Auto-generated method stub return
	 * empId; }
	 * 
	 * @Override public boolean equals(Object obj) { Employee e= (Employee) obj;
	 * if(this.empId==e.getEmpId()) { return true; }else return false; }
	 */

}
