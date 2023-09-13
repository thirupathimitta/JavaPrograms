package com.stringsPractice;

import java.util.Arrays;

public class SortStringInJavaProblem11 {

	public static void main(String[] args) {
		
	String str = new String("Srinivas garu");
	
	//using Sort method
		char[] ch = str.toLowerCase().toCharArray();
		Arrays.sort(ch);
		  String sortedString = new String(ch);
		System.out.print("sorted string with sorted method "+sortedString);
		System.out.println();
		
	//using wihtout sort method
		 int k = 0;
	      char temp = 0;
	      char[] chars = str.toLowerCase().toCharArray();
	      System.out.print(chars);
	      System.out.println();
	      
	      for (int i = 0; i < chars.length; i++) {
	         for (k = 0; k < chars.length; k++) {
	            if (chars[k] > chars[i]) {
	               temp = chars[i];
	               chars[i] = chars[k];
	               chars[k] = temp;
	            }
	         }
	      }
	      String sortedString1 = new String(chars);
	      System.out.println("Sorted String with out sort method: " + sortedString);
	}

}