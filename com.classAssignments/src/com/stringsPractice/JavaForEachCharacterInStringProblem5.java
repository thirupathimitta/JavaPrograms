package com.stringsPractice;

public class JavaForEachCharacterInStringProblem5 {

	public static void main(String[] args) {
		String str ="Weclcome to Hyderabad";
		System.out.println("The characters in the string are:-");
		System.out.println();
		int count=0;
		for(int i=0;i<str.length();i++) {
			count++;
			if(i<str.length()-1)
			System.out.print(str.charAt(i)+",");
			else System.out.print(str.charAt(i));
		}
		System.out.println();
		System.out.println();
		System.out.println("total characters in  the string is :- "+ count);
		

	}

}
