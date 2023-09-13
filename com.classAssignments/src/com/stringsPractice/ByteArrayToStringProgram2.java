package com.stringsPractice;

import java.util.Arrays;

public class ByteArrayToStringProgram2 {

	public static void main(String[] args) {

		byte[] b = {97,98,99,100,101,102,103};
		String str = new String(b);
		System.out.println(str);
		
		//converting String to Byte Array
		
		String s1= "welcome";
		byte[] b1= s1.getBytes();
		System.out.println(Arrays.toString(b1)); 

	}

}
