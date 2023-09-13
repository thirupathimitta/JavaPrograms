package com.stringsAssignments;

public class DetermineUnicodeCodePointAtGivenIndexInStringPage3_4 {

	public static void main(String[] args) {

		String str = "abcdefgh";
		for(int i=0;i<str.length();i++) {
			System.out.println(str.codePointAt(i));
			
		}
	}

}
