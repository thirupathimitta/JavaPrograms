package com.streams;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class HowToFindDuplicateMaxValueMinValueElementsInList {
	public static void main(String args[]) {
		List<Integer> myList = Arrays.asList(10, 15, 8, 49, 25, 98, 98, 32, 15);
		Set<Integer> set = new HashSet();

		/*
		 * The add() method of a HashSet returns false if the element is already present
		 * in the set, which is how you're detecting duplicates.
		 */
		myList.stream().filter(n -> !set.add(n)).forEach(System.out::println);
//		Given a list of integers, find the total number of elements present in the list using Stream functions?
		long count = myList.stream().count();
		System.out.println(count);
//Given a list of integers, find the maximum value  and mimimun value element present in it using Stream functions?
		Integer max = myList.stream().max(Integer::compare).get();
		System.out.println(max);
		Integer min = myList.stream().min(Integer::compare).get();
		System.out.println(min);
	}
}
