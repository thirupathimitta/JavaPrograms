package com.strings.assignments.page5;

import java.util.Objects;

public class CheckIfStringIsNullProb5_11 {

	
	    public static void main(String[] args) {
	        String str1 = "";
	        String str =null;
	        
	        // Using the == operator
	        if (str == null) {
	            System.out.println("The string is null.");
	        } else {
	            System.out.println("The string is not null.");
	        }
	        
	        // Using Objects.isNull() method
	        if (Objects.isNull(str)) {
	            System.out.println("The string is null.");
	        } else {
	            System.out.println("The string is not null.");
	        }
	    }
	


}
