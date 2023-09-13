package com.reviseStrings;

public class CompareTwoStrings {

	// Java program to Illustrate Comparison of Two Strings

		public static void main(String[] args)
		{
			String s1 = "Ram";
			String s2 = "Ram";
			String s5 = "Shyam";

			String s3 = new String("Ram");
			String s4 = new String("Ram");


			System.out.println(
				" Comparing strings with equals:");
			System.out.println(s1.equals(s2));//true
			System.out.println(s1.equals(s3));//true
			System.out.println(s1.equals(s5));//false

			String nulls1 = null;
			String nulls2 = null;

			

			// Comparing strings using == operator
			System.out.println(" Comparing strings with ==:");
			System.out.println(s1 == s2);//true
			System.out.println(s1 == s3);//false
			System.out.println(s3 == s4);//false
			System.out.println(nulls1 == nulls2);

			// Comparing strings via compareTo() method
			System.out.println(
				" Comparing strings via compareTo() Method :");
			System.out.println(s1.compareTo(s3));//0
			System.out.println(s1.compareTo(s5));//-1
			System.out.println(nulls1.compareTo(nulls2));//nullPointer exception
			System.out.println(nulls1.equals(nulls2));//nullPointer exception
		    System.out.println(nulls1.equals(s1));//nullPointer exception
		    

			// NullPointerException if we try to compare strings
			// with usage of compareTo() method
			// System.out.println(nulls1.compareTo(nulls2));
		}
	}



