package com.arrraysPractice;

public class Exp1 {

	public static void main(String[] args) {
		int arr[] = { 2, 5, 1, 7 };

		int arr1[] = { 5, 3, 7, 8 };
		

		int count = 0;

		for (int i = 1; i < arr.length; i++) {

			for (int j = 1; j < arr1.length; j++) {

				if (arr[i] == arr1[j])

					count++;
			}

		}
		System.out.println(count);
		
		if (count != arr1.length) {
			System.out.println("both array are not same elements");
		}
	}
}
