package com.collectorsStream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FindingCommonElementsInTwoLists {

	public static void main(String[] args) {

		List<Integer> list1 = Arrays.asList(3, 5, 8, 10, 12);
		List<Integer> list2 = Arrays.asList(5, 7, 10, 15);

		/*
		 * // Find common elements using retainAll 
		 * 
		 * List<Integer> commonElements = new ArrayList<>(list1); 
		 * commonElements.retainAll(list2);
		 */
		
	
		List<Integer> commonElements = list1.stream().filter(list2::contains).collect(Collectors.toList());

	
		System.out.println("Common Elements: " + commonElements);

	}

}
