package com.arrraysPractice;

import java.io.*;
import java.util.Arrays;


public class HowToSortArrayProblem15 {

	public static void main(String[] args) throws  IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("enter the size of array");
		int size = Integer.parseInt(br.readLine());
		int[] arr = new int[size];
		System.out.println("enter ArrayValues");
		for (int i = 0; i < arr.length; i++) {
		arr[i] = Integer.parseInt(br.readLine());
		}

		  int n = arr.length;
	        for (int i = 0; i < n ; i++) { 
	            for (int j = 0; j < n-i-1; j++) {
	            	
	                if (arr[j] > arr[j + 1]) {
	                   	
	                    int temp = arr[j];
	                    arr[j] = arr[j + 1];
	                    arr[j + 1] = temp;
	                }
	            }
	        }
	        System.out.println(Arrays.toString(arr));

	}

}
