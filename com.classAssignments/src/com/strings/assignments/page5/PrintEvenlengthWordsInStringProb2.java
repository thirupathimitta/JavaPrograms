package com.strings.assignments.page5;

public class PrintEvenlengthWordsInStringProb2 {

	
	    public static void main(String[] args) {
	        String str= "This is a sample string with even and odd length words";
	        
	        String[] words =str.split(" ");
	        
	        System.out.println("Even length words:");
	        
	        for (String word : words) {
	            if (word.length() % 2 == 0) {
	                System.out.print(word+" ");
	            }
	        }
	    }
	


}
