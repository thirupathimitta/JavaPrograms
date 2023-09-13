package com.classAssignmentsPage6And7;

public class CountOccurrencesOfGivenCharacter1 {

	public static void main(String[] args) {
		
		        String str = "Hello, world!";
		        char targetChar = 'o';

		        int count = 0;
		        for (int i = 0; i < str.length(); i++) {
		            if (str.charAt(i) == targetChar) {
		                count++;
		            }
		        }

		        System.out.println("Occurrences of '" + targetChar + "': " + count);
		    }
		


	}


