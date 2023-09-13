package com.reviseStrings;

public class Harsh {

	 public static void main(String[] args) {
	        String input = "SrinivasPothulA@1234";
	        int uppercaseCount = 0;
	        int numericCount = 0;
	        int specialCharCount = 0;
	        int lower =0;

	        for (int i = 0; i < input.length(); i++) {
	            char c = input.charAt(i);
	            if (c >= 'A' && c <= 'Z') {
	                uppercaseCount++;
	            } else if (c >= '0' && c <= '9') {
	                numericCount++;
	            } else if (c>='a'&& c<='z') {
	                lower++;
	            }else specialCharCount++;
	        }

	        System.out.println( uppercaseCount+" "+numericCount+" "+specialCharCount+" "+lower);
	        


	 }

}
