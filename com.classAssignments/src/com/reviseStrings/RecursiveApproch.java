package com.reviseStrings;

public class RecursiveApproch {

	    public static void main(String[] args) {
	        String input = "Hello, World!";
	       
	        
	        int vowelCount = countVowelsRecursive(input);
	        
	        System.out.println("Number of vowels (recursive): " + vowelCount);
	    }
	    
	    public static int countVowelsRecursive(String input) {
	        String lowercaseInput = input.toLowerCase();
	        if (lowercaseInput.length() == 0) {
	            return 0;
	        } else {
	            char ch = lowercaseInput.charAt(0);
	            int count = countVowelsRecursive(lowercaseInput.substring(1));
	            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
	                return count + 1;
	            } else {
	                return count;
	            }
	        }
	    
	}


}
