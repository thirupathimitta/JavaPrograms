package com.methodsOnStrings;

public class StringConsistsOfSpecialCharacters {

    public static void main(String[] args) {
        String text = "Hello, World!";
        
        boolean hasSpecialChars = hasSpecialCharacters(text);
       
        if (hasSpecialChars) {
            System.out.println("The string contains special characters.");
        } else {
            System.out.println("The string does not contain special characters.");
        }
    }

    public static boolean hasSpecialCharacters(String text) {
        for (int i = 0; i < text.length(); i++) {
            char c = text.charAt(i);
            if (!Character.isLetterOrDigit(c) && !Character.isWhitespace(c)) {
                return true;
            }
        }
        return false;
    }
}

