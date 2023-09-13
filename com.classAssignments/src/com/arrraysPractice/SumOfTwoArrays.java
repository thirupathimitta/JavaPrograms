package com.arrraysPractice;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class SumOfTwoArrays {

	

		public static void main(String[] args) throws Exception {
			InputStreamReader isr = new InputStreamReader(System.in);
			BufferedReader br = new BufferedReader(isr);
			System.out.println("Enter the size of an Array1");
			String str1 = br.readLine();
			int size1 = Integer.parseInt(str1);
			int[] arr1 = new int[size1];
			System.out.println("Enter the size of an Array2");
			String str2 = br.readLine();
			int size2 = Integer.parseInt(str2);
			int[] arr2 = new int[size2];
			
			if (size1 != size2) {
				System.out.println("Both Array Size must be same");
				return;
			}
			System.out.println("Enter the Elements of Array1");
			for (int i = 0; i < size1; i++) {
				String s1 = br.readLine();
				arr1[i] = Integer.parseInt(s1);
			}
			for (int a : arr1) {
				System.out.println(a);
			}
			System.out.println("Enter the Elements of Array2");
			for (int i = 0; i < size2; i++) {
				String s2 = br.readLine();
				arr2[i] = Integer.parseInt(s2);
			}
			for (int a : arr2) {
				System.out.println(a);
			}
			System.out.println("Enter the size of an Array3");
			String str3 = br.readLine();
			int size3 = Integer.parseInt(str3);
			int[] arr3 = new int[size3];

			for (int i = 0; i < size3; i++) {

				arr3[i] = arr1[i] + arr2[i];

			}
			for (int a : arr3) {
				System.out.println(a);
			}

		}



}
