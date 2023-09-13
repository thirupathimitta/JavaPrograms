package com.stringsPractice;

import java.io.*;

public class StringPalindromeInJavaProblem10 {

	public static void main(String[] args) {
		
      String str = "level";
      
            if (PalindromeMethod(str)) {
                System.out.println(str +" is a palindome");
            }else   System.out.println(str +" is not a palindome");
        }
    

    private static boolean PalindromeMethod(String str) {
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


