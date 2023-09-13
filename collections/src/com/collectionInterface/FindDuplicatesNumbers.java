package com.collectionInterface;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.*;

public class FindDuplicatesNumbers {

	public static void main(String[] args) {
		ArrayList<Integer> arrList = new ArrayList<>();
		arrList.add(20);
		arrList.add(20);
		arrList.add(21);
		arrList.add(203);
		arrList.add(203);
		arrList.add(205);
		arrList.add(206);
		arrList.add(20);
		arrList.add(204);
		arrList.add(204);
		arrList.add(207);
		
		Set<Integer> uniqueElements = new HashSet<>();
		Set<Integer> duplicates = new HashSet<>();
		
		arrList.forEach(num -> {
			if (!uniqueElements.add(num)) {
				duplicates.add(num);
			}
		});

		System.out.println("Duplicates: " + duplicates);

	}

}
