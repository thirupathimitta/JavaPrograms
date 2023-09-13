package com.reviseStrings;

import java.util.Arrays;

public class SwappingCharactersOfStringInJava {

	
	    public static void main(String[] args) {
	        String input = "Hello";
	        int index1=1;
	        int index2 = 3;
	        
	        System.out.println("Original string: " + input);
	       
	   
	        char[] charArray = input.toCharArray();
	        
	       
	        if (index1 >= 0 && index1 < charArray.length && index2 >= 0 && index2 < charArray.length) {
	            char temp = charArray[index1];
	            charArray[index1] = charArray[index2];
	            charArray[index2] = temp;
	        }
	        System.out.println("Swapped string: " + Arrays.toString(charArray));
	       
	    }
	


}
