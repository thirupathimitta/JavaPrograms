package com.stringsAssignments;

public class RemoveAllNonAlphanumericCharactersFromStringPage4_12 {

	public static void main(String[] args) {
		
		        String inputString = "Hello!@#123World";
		        
		        StringBuilder Builder = new StringBuilder();
		        
		        for (int i = 0; i < inputString.length(); i++) {
		            char c = inputString.charAt(i);
		            
		            if (Character.isLetterOrDigit(c)) {
		                Builder.append(c);
		            }
		        }

		        System.out.println(Builder.toString());
		        //-----------------------
		        //another way
		        String cleanedString = inputString.replaceAll("[^a-zA-Z0-9]", "");
		        System.out.println(cleanedString);
		


	}

}
