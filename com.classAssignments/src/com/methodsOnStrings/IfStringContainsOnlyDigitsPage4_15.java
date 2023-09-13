package com.methodsOnStrings;

public class IfStringContainsOnlyDigitsPage4_15 {

	public static void main(String[] args) {
		
		        String str = "12345";
		        
		        IfStringContainsOnlyDigitsPage4_15 ob= new IfStringContainsOnlyDigitsPage4_15();     
		        
		        boolean containsOnlyDigits =ob.checking(str);
		        System.out.println("String contains only digits : "+containsOnlyDigits);
	}
		      
	private boolean checking(String str) {
		        for (int i = 0; i < str.length(); i++) {
		            char c = str.charAt(i);
		            
		            if (!Character.isDigit(c)) {
		                return false;
		            
		            }
		        }
		        return true;
	}
		      
		    
		


	

}
