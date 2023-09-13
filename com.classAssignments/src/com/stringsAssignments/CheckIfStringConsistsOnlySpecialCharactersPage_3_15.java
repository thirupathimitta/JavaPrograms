package com.stringsAssignments;

public class CheckIfStringConsistsOnlySpecialCharactersPage_3_15 {
	

	    public static void main(String[] args) {
	        String str = "@#$%^&d!";

	        boolean hasNonSpecialCharacter = false;
	        char temp = 0 ;
	        
	        for (int i = 0; i < str.length(); i++) {
	            char c = str.charAt(i);
	            if (Character.isLetterOrDigit(c)) {
	            	temp=c;
	            	
	                hasNonSpecialCharacter = true;
	                break;
	            }
	        }

	        if (hasNonSpecialCharacter) {
	            System.out.println("The string \"" + str + "\" contains has character."+temp);
	        } else {
	            System.out.println("The string \"" + str + "\" consists only spcl characters.");
	        }
	    }
	}



//mathes() method
//System.out.println(str1.matches("[^a-zA-Z0-9]+"));
