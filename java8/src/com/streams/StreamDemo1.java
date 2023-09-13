package com.streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamDemo1 {

	public static void main(String[] args) {
		/*
		 * Stream<Integer> str = Stream.of(1,2,3,4,5,6,7,8,9);
		 * 
		 * str.forEach( System.out::println);
		 */
		
		List <String> l = new ArrayList<>();
		l.add("jhon");
		l.add("smith");
		l.add("mahesh");
		
		Stream<String> names1 = l.stream();
		
		names1.forEach(i->System.out.println(i));
		//------------------------------------filter methods------
		List <Integer> list = Arrays.asList(666,32,45,12,20);
		
//		for(Integer i :list) {
//			if(i>20) System.out.println(i);
//		}
		list.stream().filter(i->i>20).forEach(System.out::println);
		
		List<String> names = Arrays.asList("Alice", "Bob", "Anna", "Alex", "John");

        // Filter names that start with "A"
        List<String> filteredNames = names.stream()
            .filter(name -> name.startsWith("A"))
            .collect(Collectors.toList());

        System.out.println("Filtered Names: " + filteredNames);
        
        
        
		
		
	}

}