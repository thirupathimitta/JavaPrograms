package com.linkedlist;

import java.util.*;

public class LinkedListmethods {

	public static void main(String[] args) {
		LinkedList<Integer> LL = new LinkedList();

		LL.add(1);
		LL.add(2);
		LL.add(3);
		LL.add(5);
		LL.add(7);
		LL.add(null);
		LL.add(null);
		LL.add(1);
		System.out.println(LL);
		LL.addFirst(0);
		System.out.println(LL);
		LL.addLast(23);

		LL.removeFirst();
		Collections.fill(LL,45);
	

		LinkedList<Integer> LL1 = new LinkedList(LL);

		for (Integer i : LL1) {
			System.out.println(i);
		}

		System.out.println(LL.getFirst());
		
		 String element = "Hello";
	        List<String> singletonList = Collections.singletonList(element);

	        System.out.println(singletonList);
	}

}
