package com.classAssignments8And9And10;

public class equalsOnStringAndStringBufferObjectsInJava8_5 {

	public static void main(String[] args) {

			
			String str1 =new String("hello");
			String str2 =new String("hello");
			StringBuffer str3 =new StringBuffer("hello");
			StringBuffer str4 =new StringBuffer("hello");
			System.out.println(str1.equals(str2));//true
			System.out.println(str2.equals(str3));//false
			System.out.println(str3.equals(str4));//false
			System.out.println(str4.equals(str1));//false
			System.out.println(str2.equals(str3.toString()));
			System.out.println(str3.toString().equals(str2.toString()));
	}

}
