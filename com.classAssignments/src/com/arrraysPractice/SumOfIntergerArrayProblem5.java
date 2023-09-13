package com.arrraysPractice;

public class SumOfIntergerArrayProblem5 {

	public static void main(String[] args) {
		// assignment--1-->print sum of integrs in integer array
		int[] arr = { 2, 5, 1, 9, 6 };
		int sum = 0;
		for (int i = 0; i < arr.length; i++) {
			sum += arr[i];
		}
		System.out.println(sum);
		
	}

}
