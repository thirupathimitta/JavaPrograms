package com.arrraysPractice;

public class PalindromArray {

	public static void main(String[] args) {
		
		        String[] arr = {"madam", "hello", "level", "world", "racecar","aa","121"};

		        System.out.println("Palindromic Strings in the Array:");
		        for (String str : arr) {
		            if (isPalindrome(str)) {
		                System.out.println(str);
		            }
		        }
		    }

		    private static boolean isPalindrome(String str) {
		        int left = 0;
		        int right = str.length() - 1;

		        while (left < right) {
		            if (str.charAt(left) != str.charAt(right)) {
		                return false;
		            }
		            
		            left++;
		            right--;
		        }

		        return true;
		    

	}

}
