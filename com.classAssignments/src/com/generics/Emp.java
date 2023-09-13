package com.generics;


import java.util.ArrayList;
import java.util.Arrays;

public class Emp {
	
	int empId ;
	String empName;
	boolean aged ;
	double salary;

	public Emp(int empId, String empName, boolean aged, double salary) {
	
		this.empId = empId;
		this.empName = empName;
		this.aged = aged;
		this.salary = salary;
	}
	
	public String toString() {
		return empId+","+empName+","+aged+","+salary;
		
	}

	public static void main(String[] args) {
		Emp e1= new Emp(100,"vinay",false,100000);
		Emp e2= new Emp(101,"vijnay",true,100000);
	
		ArrayList<Emp> al = new ArrayList<>();
		al.add(e1);
		System.out.println(al);
		

	}

}
