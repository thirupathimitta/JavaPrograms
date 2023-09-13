package com.arrraysPractice;

import java.util.Arrays;

public class TheCumulativeSumOfArray34 {

	public static void main(String[] args) {
		  int[] arr = {1, 2, 3, 4, 5};
		  int sum=0;
		  int[] cSum = new int[arr.length];
		  
		    for(int i=0;i<arr.length;i++) {
		    	sum+=arr[i];
		    	cSum[i]=sum;
		    }
		   System.out.println(Arrays.toString(cSum)); 

	}

}
