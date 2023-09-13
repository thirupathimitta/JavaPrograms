package com.exceptionsHandling;

import java.util.Scanner;

public class EligibleVote {
	
	public static void validate(int age) throws InvlaidAgeExcpetion {
		if (age < 18) {
			throw new InvlaidAgeExcpetion("age is not valid to vote");
		} else {
			System.out.println("Welcome to vote");
		}

	}

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter age");
		int age = input.nextInt();
		try {
			
			validate(age);
			
		} catch (InvlaidAgeExcpetion e) {

			System.out.println(e);
		}
	}

}
