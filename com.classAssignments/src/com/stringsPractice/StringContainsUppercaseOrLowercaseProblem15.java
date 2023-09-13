package com.stringsPractice;

import java.io.*;

public class StringContainsUppercaseOrLowercaseProblem15 {

	public static void main(String[] args) throws IOException  {
		
		BufferedReader br =  new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the String");
		String s1=br.readLine();
		
		if(LowerCaseMethod(s1)) {
			System.out.println("It is a loweCase String ");
			
		} System.out.println("It is upperCase String ");
			

	}
	private static boolean LowerCaseMethod(String str) {
		
		for(char c:str.toCharArray()) {
			if(!Character.isLowerCase(c)) {
				return false;
			}
		}
		for(char c:str.toCharArray()) {
			if(!Character.isUpperCase(c)) {
				return false;
			}
		}
		return false;
	}

}
