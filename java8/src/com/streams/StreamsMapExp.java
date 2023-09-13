package com.streams;

import java.util.Arrays;
import java.util.List;

public class StreamsMapExp {

	
	
	public static void main(String[] args) {
		
		List<String> l = Arrays.asList("India","japan","usa","canada","argentia","iran","irac","irland");
		
		/*
		 * l.stream().map(name->name.toUpperCase()).forEach(System.out::println);
		 * 
		 * l.stream().map(name->name.length()).forEach(System.out::println);
		 * 
		 * l.stream().mapToInt(name->name.length()).forEach(System.out::println);
		 */
		l.stream().filter(name->name.toUpperCase().startsWith("I")).map(name->name.length()).forEach(System.out::println);
		
		
		
	}

}
