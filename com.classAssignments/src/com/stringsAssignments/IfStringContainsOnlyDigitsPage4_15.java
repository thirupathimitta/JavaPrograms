package com.stringsAssignments;

public class IfStringContainsOnlyDigitsPage4_15 {

	public static void main(String[] args) {
		
		        String str = "12345";
		        
		        boolean containsOnlyDigits = true;
		        
		      
		        for (int i = 0; i < str.length(); i++) {
		            char c = str.charAt(i);
		            
		            if (!Character.isDigit(c)) {
		                containsOnlyDigits = false;
		                break;
		            
		            }
		        }
		        
		        System.out.println("String contains only digits : "+containsOnlyDigits);
		    
		


	}

}
