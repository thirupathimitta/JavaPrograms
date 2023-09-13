package com.collectorsStream;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

public class CalculatingAverageStudentGrade {

	public static void main(String[] args) {
		List<Student> students = Arrays.asList(new Student("Alice", Arrays.asList(85.0, 92.5, 78.0)),
				new Student("Bob", Arrays.asList(90.0, 88.5, 92.0)),
				new Student("Charlie", Arrays.asList(76.5, 84.0, 88.0)));
		

	 Map<String, Double>  averageGrades= students.stream().collect(Collectors.toMap(Student::getName,s-> s.getGrades()
			 .stream().collect(Collectors.averagingDouble(e->e))));
	 System.out.println(averageGrades);

		// Find student with highest average grade
		Optional<Student> studentWithHighestAverage = students.stream()
				.collect(Collectors.maxBy(Comparator.comparingDouble(student -> averageGrades.get(student.getName()))));

		studentWithHighestAverage
				.ifPresent(student -> System.out.println("Student with Highest Average Grade: " + student.getName()));

	}
}

class Student {
	private String name;
	private List<Double> grades;

	public Student(String name, List<Double> grades) {
		this.name = name;
		this.grades = grades;
	}

	public String getName() {
		return name;
	}

	public List<Double> getGrades() {
		return grades;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", grades=" + grades + "]";
	}

}
