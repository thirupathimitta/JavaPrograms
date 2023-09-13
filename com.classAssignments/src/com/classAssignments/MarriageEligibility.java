package com.classAssignments;

import java.io.*;

public class MarriageEligibility {
	/*
	 * Q 2:Write a java program to read person age and person salary and print his
	 * eligibility for marriage Condition : If person age less than 30 and salary
	 * greater than 1 lakh then eligible for marriage
	 */

	public static void main(String[] args) throws IOException {

		System.out.println("enter your salary:");
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		double salary = Integer.parseInt(br.readLine());
		System.out.println("enter your age:");
		int age = Integer.parseInt(br.readLine());
		if (age < 30 && salary > 1e5) {
			System.out.println("you are eligible for marriage");
		} else {
			System.out.println("you  are not eligible for marriage");
		}
	}

}
