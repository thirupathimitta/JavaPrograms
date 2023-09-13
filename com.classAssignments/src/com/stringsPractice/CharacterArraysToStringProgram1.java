package com.stringsPractice;

import java.util.Arrays;

public class CharacterArraysToStringProgram1 {

	public static void main(String[] args) {
		
		char[] ch = {'a','b','c','d','e'};
		String str = new String(ch);//converting character to String
		System.out.println(str);
		char[] ch1 = str.toCharArray();//converting string to char array
		System.out.println(Arrays.toString(ch1));

	}

}
