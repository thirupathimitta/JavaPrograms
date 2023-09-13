package com.exceptionsHandling;

import java.util.Scanner;
public class AgeLimit {
    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Age");
		int age =sc.nextInt();
		try {
		if(age<18) {
			throw new VoteEligiblityException("Not Eligible for Vote");
		}
		else {
			System.out.println("Eligible for Vote");
		}
		}
		catch(VoteEligiblityException e) {
			System.out.println(e.getMessage());
		}
	}
}
