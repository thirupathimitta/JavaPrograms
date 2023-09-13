package com.methodsOnStrings;

public class FindAllPalindromicSubStringsOfStringPage2_2 {

	public static void main(String[] args) {
		
		        String str = "MALAYALAM";
		        findAllPalindromicSubstrings(str);
		    }

		    public static void findAllPalindromicSubstrings(String str) {
		        int length = str.length();

		        for (int i = 0; i < length; i++) {
		        	if(str.length()%2!=0) {  
			            findPalindromicSubstrings(str, i, i);
			            }else
		            
		            findPalindromicSubstrings(str, i, i + 1);
		        }
		    }

		    public static void findPalindromicSubstrings(String str, int start, int end) {
		        int length = str.length();

		        
		        while (start >= 0 && end < length && str.charAt(start) == str.charAt(end)) {
		           
		            String palindrome = str.substring(start, end + 1);
		            System.out.println(palindrome);

		            start--;
		            end++;
		        }
		 


	}

}
