package com.classAssignmentsPage6And7;

public class CheckStringStartsWithAnyGivenPrefixes7_1 {

	
	    public static void main(String[] args) {
	        String[] prefixes = {"apple", "banana", "orange"};
	        String word = "banana splitted here ";

	      

	        for (String prefix : prefixes) {
	            if (word.startsWith(prefix)) {
	            	
	            	System.out.println("The word starts with the prefix: \"" + prefix + "\"");

	            }
	        }
	       }

	    

}
