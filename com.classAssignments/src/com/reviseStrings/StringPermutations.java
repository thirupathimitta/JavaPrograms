package com.reviseStrings;

public class StringPermutations {
	 
	
	    public static void main(String[] args) {
	        String input = "abc";
	        generatePermutations(input, "");
	    }

	    public static void generatePermutations(String input, String permutation) {
	        if (input.isEmpty()) {
	            System.out.println(permutation);
	            return;
	        }

	        for (int i = 0; i < input.length(); i++) {
	            char currentChar = input.charAt(i);
	            String remainingChars = input.substring(0, i) + input.substring(i + 1);
	            generatePermutations(remainingChars, permutation + currentChar);
	        }
	    }
 	


}
