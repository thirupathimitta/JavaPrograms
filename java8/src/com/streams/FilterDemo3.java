package com.streams;

import java.util.stream.Stream;

public class FilterDemo3 {

	public static void main(String[] args) {

		User u1 = new User("Anushka", 25);
		User u2 = new User("Smith", 30);
		User u3 = new User("Raju", 15);
		User u4 = new User("Charles", 10);
		User u5 = new User("Rani", 35);
		User u6 = new User("Ashok", 30);

		Stream.of(u1, u2, u3, u4, u5, u6).filter(i -> i.age > 18 && i.name.startsWith("A"))	.forEach(System.out::println);
			

	}

}
