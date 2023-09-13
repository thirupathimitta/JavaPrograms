package com.classAssignments8And9And10;

public class StringContainsOnlyAlphabetsInJavaUsingAsciiValues8_2 {

	
	    public static void main(String[] args) {
	        String str = "HelloWorld";
	        
	        boolean containsOnlyAlphabets = true;
	        for (int i = 0; i < str.length(); i++) {
	            char ch = str.toUpperCase().charAt(i);
	            if (!((ch >= 'A' && ch <= 'Z'))) {
	                containsOnlyAlphabets = false;
	                break;
	            }
	        }
	        
	        if (containsOnlyAlphabets) {
	            System.out.println("The string contains only alphabets.");
	        } else {
	            System.out.println("The string contains non-alphabetic characters.");
	        }
	    
	        
	}


}
