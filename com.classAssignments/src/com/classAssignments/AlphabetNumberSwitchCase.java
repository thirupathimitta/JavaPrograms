package com.classAssignments;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class AlphabetNumberSwitchCase {

	public static void main(String[] args) throws IOException {
		BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
		char c = br.readLine().toLowerCase().charAt(0);			
		switch(c) {
		case 'a':
			System.out.println("1");
			break;
		case 'b':
			System.out.println("2");
			break;
		case 'c':
			System.out.println("3");
			break;
		case 'd':
			System.out.println("4");
			break;
		case 'e':
			System.out.println("5");
			break;
		case 'f':
			System.out.println("6");
			break;
		case 'g':
				System.out.println("7");
				break;
		case 'h':
					System.out.println("8");
					break;
		case 'i':
					System.out.println("9");
					break;
			default:
				System.out.println("enter a-i characters only");
		}

	}

}
