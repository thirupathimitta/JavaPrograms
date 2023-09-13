package com.arrraysPractice;

public class LargestNumberSmallestNumberProblem12And13 {

	public static void main(String[] args) {
		int[] arr = {2,6,7,12,45,-12,456,122};
		int max = arr[0];
		int min =arr[0];
		
		
		for(int i=0;i<arr.length;i++) {
			
			if(arr[i]>max) {
				max=arr[i];
			}
			if(arr[i]<min) {
				min=arr[i];
			}
		}
		System.out.println(max +" "+ min);
	}

}
