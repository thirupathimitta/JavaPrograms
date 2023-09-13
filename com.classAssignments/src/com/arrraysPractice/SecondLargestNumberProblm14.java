package com.arrraysPractice;

import java.io.*;

public class SecondLargestNumberProblm14 {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("enter the size of array");
		int size = Integer.parseInt(br.readLine());
		int[] a = new int[size];
		System.out.println("enter ArrayValues");
		for (int i = 0; i < a.length; i++) {
			a[i] = Integer.parseInt(br.readLine());
		}

		int sLarge = a[0];
		int fLarge = a[0];
		if (a.length < 2) {
			System.out.println("there is no second largest");
		} else {

			for (int i = 0; i < a.length; i++) {
				if (a[i] > fLarge) {
					sLarge = fLarge;
					fLarge = a[i];
				} else if (a[i] > sLarge && a[i] < fLarge) {
					sLarge = a[i];
				}
			}
		}
		if (fLarge == sLarge) {
			System.out.println("all values are equal there is no second largest");
		} else
			System.out.println(sLarge + " " + fLarge);

	}

}
