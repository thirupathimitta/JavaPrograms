package com.patterns;

//31-05-2023
public class Pattern6 {

	public static void main(String[] args) {

		for (int i = 1; i <= 5; i++) {

			for (int j = 1; j <= 5 - i; j++) {

				System.out.print(" ");
			}

			for (int k = 1; k <= i; k++) {
				System.out.print("* ");
			}
			System.out.println();
		}

	}

}
