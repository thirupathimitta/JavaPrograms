package com.streams;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FindDuplictesInString {

	public static void main(String[] args) {
		String input = "ILoveWatchingCricketWithMyFriends";

		input.chars().mapToObj(ch -> (char) ch)
				.collect(Collectors.groupingBy(Function.identity(), Collectors.counting())).entrySet().stream()
				.filter(entry -> entry.getValue() == 2).map(entry -> entry.getKey()).forEach(System.out::print);
		
		System.out.println();
		System.out.println("-----------=======================================-------------");
		
		//using Set 
		
		Set<String> s= new HashSet();
		
		
		Set<String> collect = Arrays.stream(input.toLowerCase().split("")).filter(e->!s.add(e)).collect(Collectors.toSet());
		System.out.println(collect);
		System.out.println(s);
		
		
		
	}

}
