package com.stringsAssignments;

public class RemoveUppercaseLowercaseSpecialNumericNonNumericCharactersPage3_5 {

	public static void main(String[] args) {
		
		        String str = "H3ll0, W0rld!";
		        
		      RemoveUppercaseLowercaseSpecialNumericNonNumericCharactersPage3_5.removeCharacters(str);
		        
		      
		    }

		    public static void removeCharacters(String str) {
		    	
//		        // Remove uppercase letters
//		        str = str.replaceAll("[A-Z]", "");
//
//		        // Remove lowercase letters
//		        str = str.replaceAll("[a-z]", "");

		        // Remove special characters
//		        str = str.replaceAll("[^0-9]", "");

//		        // Remove numeric characters
//		        str = str.replaceAll("[0-9]", "");
//
//		        // Remove non-numeric characters
//		        str = str.replaceAll("[^0-9]", "");
		    	for (int i=0;i<str.length();i++) {
		    		char ch=str.charAt(i);
		    		if(Character.isDigit(ch)) {
		    			System.out.print(ch+" ");
		    		}
		    	}

		    }


}
