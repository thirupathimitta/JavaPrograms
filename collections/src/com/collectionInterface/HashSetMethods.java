package com.collectionInterface;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class HashSetMethods {
	public static void main(String[] args) {
		List<String> List = new ArrayList<>();
		
		List.add("hi");
		
		List<String> unmodifiableList = Collections.unmodifiableList(List);
		unmodifiableList.add("two"); // This line will throw UnsupportedOperationException
	}

}
