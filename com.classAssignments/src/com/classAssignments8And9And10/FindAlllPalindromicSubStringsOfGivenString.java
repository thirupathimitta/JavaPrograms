package com.classAssignments8And9And10;

public class FindAlllPalindromicSubStringsOfGivenString {

	
	    public static void main(String[] args) {
	        String str = "ababa";
	        
	        String[] palindromicSubstrings = findPalindromicSubstrings(str);
	        
	        System.out.println("Palindromic Substrings:");
	        for (String substring : palindromicSubstrings) {
	            System.out.println(substring);
	        }
	    }
	    
	    public static String[] findPalindromicSubstrings(String str) {
	        int count = 0; // Count of palindromic substrings
	        int n = str.length();
	        String[] palindromicSubstrings = new String[n * n];
	        
	        // Iterate over each character of the string
	        for (int i = 0; i < n; i++) {
	            // Find palindromic substrings with odd length
	            int left = i;
	            int right = i;
	            
	            while (left >= 0 && right < n && str.charAt(left) == str.charAt(right)) {
	                palindromicSubstrings[count] = str.substring(left, right + 1);
	                count++;
	                left--;
	                right++;
	            }
	            
	            // Find palindromic substrings with even length
	            left = i;
	            right = i + 1;
	            
	            while (left >= 0 && right < n && str.charAt(left) == str.charAt(right)) {
	                palindromicSubstrings[count] = str.substring(left, right + 1);
	                count++;
	                left--;
	                right++;
	            }
	        }
	        
	        // Create a new array with the exact number of palindromic substrings
	        String[] result = new String[count];
	        System.arraycopy(palindromicSubstrings, 0, result, 0, count);
	        
	        return result;
	    
	}


}
