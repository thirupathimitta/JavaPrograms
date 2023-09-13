package com.arrraysPractice;

public class AverageOfIntergersArrayProblem6 {

	public static void main(String[] args) {
//		assigment2--avg of integers in int array----
		
		int[] arr = { 2, 5, 3, 9, 6 };
		int sum = 0;
		for (int i = 0; i < arr.length; i++) {
			sum += arr[i];
		}
		System.out.println(sum/arr.length);

	}

}
