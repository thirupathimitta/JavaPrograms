package com.streams;

import java.util.Arrays;
import java.util.List;

public class StramLimitDistinctSkipDemo {

	public static void main(String[] args) {
	
		List <Integer> l = Arrays.asList(1,2,3,4,5,6,7,8,9,1,2,3,4,5,6,7,89,7);
		
		l.stream().distinct().forEach(System.out::println);
		System.out.println("_________________________________________");
		l.stream().limit(9).forEach(System.out::println);
System.out.println("*****************************************");
		l.stream().skip(8).forEach(System.out::println);
	}

}
