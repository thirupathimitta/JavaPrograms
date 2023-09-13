package com.patterns;

public class Pattern9 {

	public static void main(String[] args) {
		int size = 3;

		for (int i = size; i >= 1; i--) {
		    for (int j = i; j >= 1; j--) {
		        System.out.print("* ");
		    }
		    System.out.println();
		}

		for (int i = 1; i <= size; i++) {
		    for (int j = 1; j <= i; j++) {
		        System.out.print("* ");
		    }
		    System.out.println();
		}






	}

}
