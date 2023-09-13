package com.classAssignments8And9And10;

public class RemovingWhiteSpacesUsingRegexInJava8_4 {
	
	    public static void main(String[] args) {
	        String str = "  Hello  World  ";
	        
	        String result = str.replaceAll("\\s", "");
	        
	        System.out.println("Original String: " + str);
	        System.out.println("String after removing whitespaces: " + result);
	    }
	


}
