package com.classAssignments8And9And10;

public class PrintNumberOfWordsVowelsAndFrequencyOfEachCharacter8_8 {

	public static void main(String[] args) {
		
		        String input = "Hello, World!";
		        
		        // Number of words
		        String[] words = input.trim().split("\\s+");
		       
		      
		        System.out.println("Number of words: " + words.length);
		        
		        // Number of vowels
		       
		      
			        int count = 0;
			        String lowercaseInput = input.toLowerCase();
			        for (int i = 0; i < lowercaseInput.length(); i++) {
			            char ch = lowercaseInput.charAt(i);
			            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
			                count++;
			            }
			        }
		        
		        System.out.println("Number of vowels: " + count);
		        
		        // Frequency of each character
		        countCharacterFrequency(input);
		    }
		    
		  
		    
		   
		    
		    public static void countCharacterFrequency(String input) {
		        int[] frequency = new int[256];  // Assuming ASCII characters
		        
		        for (int i = 0; i < input.length(); i++) {
		            char ch = input.charAt(i);
		            frequency[ch]++;
		           
		        }
		        
		        
		        System.out.println("Character Frequency:");
		        for (int i = 0; i < frequency.length; i++) {
		            if (frequency[i] > 0) {
		                System.out.println((char) i + ": " + frequency[i]);
		            }
		        }
		    }
		


	

}
