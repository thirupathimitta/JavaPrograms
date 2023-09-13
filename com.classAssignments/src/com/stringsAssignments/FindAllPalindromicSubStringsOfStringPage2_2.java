package com.stringsAssignments;

public class FindAllPalindromicSubStringsOfStringPage2_2 {

	

	    public static void main(String[] args) {
	        String str = "MALAYALAM";
	        int length = str.length();

	        for (int i = 0; i < length; i++) {
	            int start = i;
	            int end = i;

	            while (start >= 0 && end < length && str.charAt(start) == str.charAt(end)) {
	                String palindrome = str.substring(start, end + 1);
	                System.out.println(palindrome);

	                start--;
	                end++;
	            }

	            start = i;
	            end = i + 1;

	            while (start >= 0 && end < length && str.charAt(start) == str.charAt(end)) {
	                String palindrome = str.substring(start, end + 1);
	                System.out.println(palindrome);

	                start--;
	                end++;
	            }
	        
	    }
	}



}
