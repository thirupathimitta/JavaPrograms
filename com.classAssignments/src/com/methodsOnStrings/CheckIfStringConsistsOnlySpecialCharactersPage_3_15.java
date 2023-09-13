package com.methodsOnStrings;

public class CheckIfStringConsistsOnlySpecialCharactersPage_3_15 {

	public static void main(String[] args) {
		
		        String str1 = "@#$%^&!";
		        String str2 = "Hello, World!";
		       
		        
		        System.out.println(str1 + " consists only of special characters: " + consistsOnlySpecialCharacters(str1));
		        System.out.println(str2 + " consists only of special characters: " + consistsOnlySpecialCharacters(str2));
		    }

		    public static boolean consistsOnlySpecialCharacters(String str) {
		    	
		        for (int i = 0; i < str.length(); i++) {
		            char c = str.charAt(i);
		            
		            if (Character.isLetterOrDigit(c)) {
		                return false;
		            }
		        }
	
	        return true;

	}

}
