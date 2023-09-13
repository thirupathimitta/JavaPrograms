package com.stringsPractice;

public class HowToCompareStringsInJavaProblem12 {

	public static void main(String[] args) {
		/*
		 * By Using equals() Method 
		 * By Using == Operator
		 *  By compareTo() Method
		 */
		
		String s1="srinivas";
		String s2=new String("srinivas");
		String s3="Srinivas";
		String s4= new String ("thirupathi");
		System.out.println(s1.equals(s2));
		System.out.println(s1==s2);
		System.out.println(s1.equalsIgnoreCase(s3));//equalsIgnoreCase() returns true regardless of cases of strings.
		
		/*compareTo()
		 * s1 == s2 : The method returns 0. 
		 * s1 > s2 : The method returns a positive
		 * value. s1 < s2 : The method returns a negative value.
		 */
		System.out.println(s1.compareTo(s4));//-1
		System.out.println(s1.compareToIgnoreCase(s3));//0
		System.out.println(s4.compareTo(s2));//1
		
		
	}

}
