package com.stringsAssignments;

public class OptimizeStringConcatenationInJavapage3_3 {

	public static void main(String[] args) {
		String str1 = "Hello";
		String str2 = "World";

		// Inefficient way using the + operator
		String result1 = str1 + ", " + str2;

		// More efficient way using the concat() method
		String result2 = str1.concat(", ").concat(str2);

		// Alternatively, you can use the += operator
		String result3 = str1;
		result3 += ", ";
		result3 += str2;
		System.out.println(result1);
		System.out.println(result2);
		System.out.println(result3);


	}

}
