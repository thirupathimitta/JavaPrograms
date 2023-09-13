package com.collectorsStream;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class GroupingAndCountWordsByLength {
	
	/*
	 * Your Task:
	 * Create a list of words (strings) containing a variety of words.
	 *  Group the  words by their length and count how many words there are for each length.
	 * Display the word length and the corresponding count.
	 */

	public static void main(String[] args) {
		
		String[] arr = {"apple", "banana", "cat", "dog", "elephant", "fish","abcde"};
		List <String> names = Arrays.asList(arr);
		Map<Integer, Long> collect = names.stream().collect(Collectors.groupingBy(F->F.length(),Collectors.counting()));
	 
		 collect.forEach((length,count)-> System.out.println("Length"+ length+" : "+ count+" words"));
	}

}

