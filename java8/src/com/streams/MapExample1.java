package com.streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MapExample1 {

	public static void main(String[] args) {
		List<String> words = Arrays.asList("apple", "banana", "cherry");

		// Using map to convert each word to uppercase and then adding "!" at the end
		
		words.stream().map(String::toUpperCase).map(word -> word + "!").forEach(System.out::println);
				

		
	}
}
