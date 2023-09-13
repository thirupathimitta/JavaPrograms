package com.stringsPractice;

public class FindLengthOfTheStringWithOutLengthMethodProblem3 {

	public static void main(String[] args) {
		
		
		String str="thirupathi";
		int count=0;
		char[] ch = str.toCharArray();
		for(char x:ch) {
			count++;
			System.out.print(x+" ");
		}
		System.out.println();
		System.out.println(count);
		System.out.println(ch.length);	

	}

}
