package com.strings.assignments.page5;

public class CheckIfStringContainsOnlyWhitespacesProb5_10 {

	
	    public static void main(String[] args) {
	        String str = "   ";
	        
	        boolean result = str.trim().isEmpty();
	        
//	        boolean result1= str.matches("\\s*");
	        
	        if (result) {
	            System.out.println("The string contains only whitespaces.");
	        } else {
	            System.out.println("The string contains non-whitespace characters.");
	        }
	    }
	


}
