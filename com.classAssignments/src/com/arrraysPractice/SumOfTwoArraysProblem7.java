package com.arrraysPractice;

import java.util.Arrays;

public class SumOfTwoArraysProblem7 {

	public static void main(String[] args) {
		int[] a = { 2, 3, 4, 5 ,6};
		int[] b = { 1, 2, 3, 4, 5 };
		int[] c = new int[a.length];
		
		if (a.length == b.length) {
			for (int i = 0; i < a.length; i++) {
				c[i] = a[i] + b[i];
			}
			System.out.println(Arrays.toString(c));
		} else
			System.out.println("both arrays should have same length");

	}

}
