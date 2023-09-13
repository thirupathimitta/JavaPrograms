package com.collectorsStream;

import java.util.*;
import java.util.stream.Collectors;

public class CollectorsExamples {
	public static void main(String[] args) {

		List<Person> people = Arrays.asList(new Person("Alice", 25, false), new Person("Bob", 30, true),
				new Person("Charlie", 22, true), new Person("David", 30, true), new Person("Eva", 2, false));

		// Collecting Names into a List
		List<String> names = people.stream().map(Person::getName).collect(Collectors.toList());
		System.out.println("Names: " + names);

		// Collecting Unique Ages into a Set
		Set<Integer> uniqueAges = people.stream().map(Person::getAge).collect(Collectors.toSet());
		System.out.println("Unique Ages: " + uniqueAges);

		// Collecting Names into a Comma-Separated String
		String namesString = people.stream().map(Person::getName).collect(Collectors.joining(", "));
		System.out.println("Names String: " + namesString);

		// Collecting Persons into a Map by Name
		Map<String, Person> personMap = people.stream().collect(Collectors.toMap(Person::getName, person -> person));
		System.out.println("Person Map: " + personMap);

		Double averageAge = people.stream().collect(Collectors.averagingInt(Person::getAge));
		System.out.println("Average Age: " + averageAge);

		// Grouping People by Age
		Map<Integer, List<Person>> peopleByAge = people.stream().collect(Collectors.groupingBy(Person::getAge));
		System.out.println("People by Age: " + peopleByAge);

		// Partitioning People by Gender
		Map<Boolean, List<Person>> peopleByGender = people.stream().collect(Collectors.partitioningBy(Person::isMale));
		System.out.println("People by Gender: " + peopleByGender);
	}
}

class Person {
	private String name;
	private int age;
	private boolean isMale;

	public Person(String name, int age, boolean isMale) {
		this.name = name;
		this.age = age;
		this.isMale = isMale;
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	public boolean isMale() {
		return isMale;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + ", isMale=" + isMale + "]";
	}
	
}
