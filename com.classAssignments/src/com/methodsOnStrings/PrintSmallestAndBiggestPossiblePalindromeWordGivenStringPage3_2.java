package com.methodsOnStrings;

public class PrintSmallestAndBiggestPossiblePalindromeWordGivenStringPage3_2 {
	 public static void findPalindromeWords(String str) {
	        String[] words = str.split("\\s+"); // split the string into individual words

	        String smallestPalindrome = null;
	        String biggestPalindrome = null;

	        for (String word : words) {
	            // Remove punctuation and convert to lowercase for comparison
	            String cleanedWord = word.replaceAll("[^a-zA-Z]", "").toLowerCase();

	            // Check if the word is a palindrome
	            if (isPalindrome(cleanedWord)) {
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

	    private static boolean isPalindrome(String word) {
	        int left = 0;
	        int right = word.length() - 1;

	        while (left < right) {
	            if (word.charAt(left) != word.charAt(right)) {
	                return false;
	            }
	            left++;
	            right--;
	        }

	        return true;
	    }

	    public static void main(String[] args) {
	        String input = "Wow! Madam Arora teaches malayalam";
	        findPalindromeWords(input);
	    }
	
}
