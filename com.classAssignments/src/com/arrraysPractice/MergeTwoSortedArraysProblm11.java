package com.arrraysPractice;

import java.util.Arrays;

public class MergeTwoSortedArraysProblm11 {

	public static void main(String[] args) {
		 int [] arr1 = {10, 20, 30, 40, 50};
	      int [] arr2= {9, 18, 27, 36, 45,50};
	      int[] arrCopy = new int[arr1.length+arr2.length];
	      //merging by using --> System.arraycopy(source,index,destination,index,length)
	      System.arraycopy(arr1, 0, arrCopy, 0, arr1.length);
	      System.arraycopy(arr2, 0, arrCopy, arr1.length, arr2.length);
	      Arrays.sort(arrCopy);
	      System.out.print(Arrays.toString(arrCopy));

	}

}
