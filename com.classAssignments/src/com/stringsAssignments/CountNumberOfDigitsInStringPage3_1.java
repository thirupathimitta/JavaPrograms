package com.stringsAssignments;

import java.io.*;

public class CountNumberOfDigitsInStringPage3_1 {
	
		public static void main(String[] args) throws IOException {
			
			String str = "thiru@12345";
			System.out.println(str);
			int sum =0;
			int count=0;
			for(int i=0;i<str.length();i++) {
				char ch = str.charAt(i);
//				if(Character.isDigit(ch)) {
//					int value =  Integer.parseInt( String.valueOf(ch));
//					sum+=value;
//					count++;
//				}
				if(ch>='0'&& ch<='9') {
					int value = Character.getNumericValue(ch);// Integer.parseInt( String.valueOf(ch))
					sum+=value;
					count++;
					
				}
			}
			System.out.println("the sum of numbers in the string \" "+str+"\" is "+ sum);
			System.out.println(count);
		
		}
		
}
