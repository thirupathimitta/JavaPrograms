package com.stringsPractice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class FindSumOfDigitsInStringProblem6 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("enter the String ");
		String str = br.readLine();
		System.out.println(str);
		int sum =0;
		for(int i=0;i<str.length();i++) {
			char ch = str.charAt(i);
			if(Character.isDigit(ch)) {
				int value = Character.getNumericValue(ch);
				sum+=value;
			}
		}
		System.out.println("the sum of numbers in the string \" "+str+"\" is "+ sum);
		
	}

}
