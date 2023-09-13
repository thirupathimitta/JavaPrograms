package com.strings.assignments.page5;

public class HowToPadStringProb1 {


	    public static void main(String[] args) {
	        String inputString = "thiru";
	        
	        String LeftPaddedString = String.format("%10s", inputString).replace(' ', '-');
	        System.out.println( LeftPaddedString );
	        String rigthPaddedString = String.format("%-10s", inputString).replace(' ', '-');
	        System.out.println( rigthPaddedString );

           
	    }
	 
	            
	           



}
