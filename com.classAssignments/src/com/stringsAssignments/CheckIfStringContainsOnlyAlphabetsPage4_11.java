package com.stringsAssignments;

public class CheckIfStringContainsOnlyAlphabetsPage4_11 {

	public static void main(String[] args) {
		
		        String inputString = "HelloWorld";
		        
		        boolean containsOnlyAlphabets = true;
		        
		        for (int i = 0; i < inputString.length(); i++) {
		            char c = inputString.charAt(i);
		            
		            if (!Character.isLetter(c)) {
		                containsOnlyAlphabets = false;
		                break;
		            }
		        }
		        
		        System.out.println(containsOnlyAlphabets);
		        
		       
		


	}

}
//another way
//boolean result = inputString.matches("[a-zA-Z]+");
//System.out.println(result);