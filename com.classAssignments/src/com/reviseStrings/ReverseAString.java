package com.reviseStrings;

import java.io.*;
import java.util.Scanner;

public class ReverseAString {


		public static void main (String[] args) {
		
			String str= "Geeks", nstr="",nstr1="";
			
			for(int i=0,j=str.length()-1;i<str.length();i++,j--) {
				
				nstr1+=str.charAt(j);
				nstr=str.charAt(i)+nstr;
				}
			System.out.println(nstr);
			System.out.println(nstr1);
			//another way-------------------------------
			String input = "GeeksforGeeks";
	
	        byte[] strAsByteArray = input.getBytes();
	 
	        byte[] result = new byte[strAsByteArray.length];
	 
	        for (int i = 0; i < strAsByteArray.length; i++)
	            result[i] = strAsByteArray[strAsByteArray.length - i - 1];
	 
	        System.out.println(new String(result));
			
			}
}
