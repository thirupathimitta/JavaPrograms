package com.stringsAssignments;

public class PrintSmallestAndBiggestPossiblePalindromeWordGivenStringPage3_2 {
	

	    public static void main(String[] args) {
	        String input = "Wow! Madam Arora teaches malayalam";
	        String[] words = input.split("\\s+");

	        String smallestPalindrome = null;
	        String biggestPalindrome = null;

	        for (String word : words) {
	            String cleanedWord = word.replaceAll("[^a-zA-Z]", "").toLowerCase();

	            boolean isPalindrome = true;
	            int left = 0;
	            int right = cleanedWord.length() - 1;

	            while (left < right) {
	                if (cleanedWord.charAt(left) != cleanedWord.charAt(right)) {
	                    isPalindrome = false;
	                    break;
	                }
	                left++;
	                right--;
	            }

	            if (isPalindrome) {
	                if (smallestPalindrome == null || cleanedWord.length() < smallestPalindrome.length()) {
	                    smallestPalindrome = cleanedWord;
	                }

	                if (biggestPalindrome == null || cleanedWord.length() > biggestPalindrome.length()) {
	                    biggestPalindrome = cleanedWord;
	                }
	            }
	        }

	        System.out.println("Smallest palindrome word: " + smallestPalindrome);
	        System.out.println("Biggest palindrome word: " + biggestPalindrome);
	    }
	}


		   


	


