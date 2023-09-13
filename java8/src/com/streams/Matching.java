package com.streams;

import java.util.Arrays;
import java.util.List;

public class Matching {

	public static void main(String[] args) {
		Student s1 = new Student ("thiru","India");
		Student s2 = new Student ("raju","India");
		Student s3 = new Student ("jhon","usa");
		Student s4= new Student ("smith","canada");
		Student s5 = new Student ("raj","India");
		Student s6 = new Student ("devid","usa");
		
		List<Student> l = Arrays.asList(s1,s2,s3,s4,s5,s6);

 boolean anyMatch = l.stream().anyMatch(s->s.Country.toLowerCase().equals("india"));
  System.out.println("is any indian available? ->"+anyMatch);
  boolean allMatch = l.stream().allMatch(s->s.Country.toLowerCase().equals("india"));
  System.out.println("all students are from indians? -> "+allMatch);
  
  boolean nonMatch = l.stream().noneMatch(s->s.Country.toLowerCase().equals("china"));
	System.out.println("no student from chaina? -> "+nonMatch);
	}

}
 class Student{
	String name;
	String Country;
	public Student(String name, String country) {
		
		this.name = name;
		Country = country;
	}
	
}