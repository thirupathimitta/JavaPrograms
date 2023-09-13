package com.arrraysPractice;

import java.util.Arrays;

public class FindTheSumOfPositiveNumbersArrayProblem33 {

	public static void main(String[] args) {
	

	int arr []= {1,2,3,4,5,0,0,-3,-4,-5,-6,0,0,-2,4,2,-4,-1,9};
	int sum=0;
	
	 for(int i =0,j=0,k=0;i<arr.length;i++) {
		 if(arr[i]>0) {
		 sum+=arr[i];
		 }
		
	 }
	 System.out.println(sum);
	 
	
	 
}
}
