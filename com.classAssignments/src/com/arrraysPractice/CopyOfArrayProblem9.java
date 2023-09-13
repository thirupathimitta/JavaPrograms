package com.arrraysPractice;

import java.util.Arrays;

public class CopyOfArrayProblem9 {

	public static void main(String[] args) {
		System.out.println("--------(1).using loop-----------");
		int[] arr= {2,3,4,5,6,7};
		int[] copyArray =new int[arr.length];
		for(int i=0;i<arr.length;i++) {
			copyArray[i]=arr[i];
		}
		for(int x:copyArray) {
			System.out.print(x+" ");
		}
		System.out.println();
		System.out.println("---(2).using System.arraycopy()-----------");
		int[] arr1= {2,3,4,5,6,7,6,7,8};
		int[] copyArray1 =new int[arr1.length];
		System.arraycopy(arr1, 0, copyArray1, 0,arr1.length);
		for(int x:copyArray1) {
			System.out.print(x+" ");
		}
		System.out.println();
		
		System.out.println("---(3).using ArrayscopyOf()-----------");
		int[] arr2 = {1, 2, 3, 4, 5};
		int[] copyArray2 = Arrays.copyOf(arr2, arr2.length);
		for(int x:copyArray2) {
			System.out.print(x+" ");
		}

		
	}
}
