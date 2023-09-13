package com.functionalinterface;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class PredicateExp1 {

	public static void main(String[] args) {

		String[ ] names = { "Anushka", "Anupama", "Deepika", "Kajol", "Sunny" };

		Predicate<String> p = name -> name.charAt(0) == 'A';

		for (String name : names) {
			if ( p.test(name) ) {
				System.out.println(name);
			}
		}
		
		//===================================
		//=========> Example2 <=====================
		Person p1 = new Person("John", 26);
		Person p2 = new Person("Smith", 16);
		Person p3 = new Person("Raja", 36);
		Person p4 = new Person("Rani", 6);

		List<Person> persons = Arrays.asList(p1, p2, p3, p4);

		Predicate<Person> predicate = per -> per.age >= 18;

		for (Person person : persons) {
			if (predicate.test(person)) {
				System.out.println(person.name);
			}
		}
	}

}
class Person {

	String name;
	int age;

	Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
}