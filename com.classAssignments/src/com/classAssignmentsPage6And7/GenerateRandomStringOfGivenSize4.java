package com.classAssignmentsPage6And7;

import java.util.Random;

public class GenerateRandomStringOfGivenSize4 {

	public static void main(String[] args) {
		
		        int size = 6; // Desired size of the random string

		        String characters = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
		        
		       String str ="";

		        Random random = new Random();
		        for (int i = 0; i < size; i++) {
		            int index = random.nextInt(characters.length());
		            char randomChar = characters.charAt(index);
		           str+=randomChar;
		        }
		        
		        System.out.println(str);
	}

}
