package com.collectionInterface;


import java.util.Comparator;
import java.util.TreeSet;


	
	class MyComparator1 implements Comparator<String> {

	    @Override
	    public int compare(String str1, String str2) {
	        if (str1.compareTo(str2) > 0) {
	            return -1; 
	        } else if (str1.compareTo(str2) < 0) {
	            return 1; 
	        } else {
	            return 0;
	        }
	    }
	}

	public class ComparableOnStrings {

	    public static void main(String[] args) {
	        TreeSet<String> t = new TreeSet<>(new MyComparator1()); 
	        t.add("apple");
	        t.add("banana");
	        t.add("grape");
	        t.add("cherry");
	        t.add("fig");
	        System.out.println(t);
	    }
	}


