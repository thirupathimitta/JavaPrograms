package com.classAssignmentsPage6And7;

public class ReplaceCharacterAtSpecificIndexInString6 {

	
	    public static void main(String[] args) {
	        String str = "Hello, World!";
	        int index = 7; // Index of the character to replace
	        char newChar = 'M'; // New character to replace with


	        char[] ch = str.toCharArray();
	        ch[index] = newChar;
	        String str1 = new String(ch);
	        System.out.println(str1);

	  
	    }
	

}
