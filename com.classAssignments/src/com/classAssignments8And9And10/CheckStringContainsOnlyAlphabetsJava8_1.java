package com.classAssignments8And9And10;

public class CheckStringContainsOnlyAlphabetsJava8_1 {

	    public static void main(String[] args) {
	        String str = "HelloWorld";
	        
	        boolean containsOnlyAlphabets = true;
	        for (int i = 0; i < str.length(); i++) {
	            char ch = str.charAt(i);
	            if (!Character.isLetter(ch)) {
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
