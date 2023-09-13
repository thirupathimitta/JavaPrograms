package com.arrraysPractice;

import java.util.Arrays;

public class secondLargestWithRepated {

	public static void main(String[] args) {
		
		int[] arr = { 11, 3, 43, 4, 5, 4, 55, 67, 8, 93,56,93,93,93 };

		for (int i = 0; i < arr.length; i++) {

			for (int j = i+1; j < arr.length; j++) {
				
				
				if(arr[i]>arr[j]) {
					
					int temp = arr[i];
					arr[i]=arr[j];
					arr[j]=temp;				
				}
			}			
		}
		for(int i=arr.length-1;i>0;i--) {
			
			if(arr[i]!=arr[i-1]) {
				System.out.println(arr[i-1]);
				break;
			}
		}
		
		System.out.println(Arrays.toString(arr));
		
		System.out.println(arr[arr.length-2]);
	}
}
