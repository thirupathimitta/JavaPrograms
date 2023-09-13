package com.stringsPractice;

public class IteratethroughStringJavaProblem4 {

	public static void main(String[] args) {
		 String str= "JAVA";
		 for(int i=0;i<str.length();i++) {
			 if(i<str.length()-1)
			 System.out.print(str.charAt(i)+" --> ");
			 else System.out.print(str.charAt(i));
		 }

	}

}
