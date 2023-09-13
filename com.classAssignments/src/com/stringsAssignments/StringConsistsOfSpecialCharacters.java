package com.stringsAssignments;

public class StringConsistsOfSpecialCharacters {

	public static void main(String[] args) {
			String text = "Hello, World!";
		
        
//       boolean hasSpecialChars = text.matches(".*[^a-zA-Z0-9 ].*"); //matches()
        ////////////////////////////////////////////
        boolean hasSpecialChars = false;
        for (int i = 0; i < text.length(); i++) {
            char c = text.charAt(i);
            if (!Character.isLetterOrDigit(c) && !Character.isWhitespace(c)) {
                hasSpecialChars = true;
                break;
            }
        }
       
       
        
        if (hasSpecialChars) {
            System.out.println("The string contains special characters.");
        } else {
            System.out.println("The string does not contain special characters.");
        }
	}

}
