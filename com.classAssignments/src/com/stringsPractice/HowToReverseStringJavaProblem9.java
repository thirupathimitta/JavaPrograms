package com.stringsPractice;

import java.util.Arrays;

public class HowToReverseStringJavaProblem9 {

	
	public static void main(String[] args) {
		String str = new String("Srinivas");
		char[] ch = str.toCharArray();
		str.concat("hi");
	String[] s2= str.split("");
	System.out.println(Arrays.toString(s2));
	

		
		char temp;
		for(int i=0;i<ch.length/2;i++) {
			temp=ch[i];
			ch[i]=ch[ch.length-i-1];
			ch[ch.length-i-1] =temp;
			
		}
		System.out.println(ch);
				                               
	}
}
