package com.methodsOnStrings;

import java.io.IOException;

public class CountNumberOfDigitsInStringPage3_1 {
    	
		public static void main(String[] args) throws IOException {
			
			String str = "thiru@345789";
			System.out.println(str);
			CountNumberOfDigitsInStringPage3_1 ob=new CountNumberOfDigitsInStringPage3_1();
			int count =  ob.numberOfDigits(str);
			
			
			System.out.println("\ncount is "+count);
		
		}
		private int numberOfDigits (String str) {
		
			int count=0;
			for(int i=0;i<str.length();i++) {
				char ch = str.charAt(i);
//				if(Character.isDigit(ch)) {
//					int value =  Integer.parseInt( String.valueOf(ch));
//					sum+=value;
//					count++;
//				}
				if(ch>='0'&& ch<='9') {
					System.out.print(ch+" ");
					
					count++;
					
				}
			}
			return count;
		}
		
}
