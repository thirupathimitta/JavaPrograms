package com.arrraysPractice;

import java.util.Iterator;

public class Reversearr {
public static void main(String[] args) {
	int[] revArr = {10, 23, 45, 89};
	 int [] revArray=Reversearr.revArr(revArr);
	
	for (int value : revArray) {
	    System.out.print(value + " ");
	}
	
}

public static int[] revArr(int[] arr) {
	int i;
	int j;
	int[] revArr = new int[4];
	for (i = 0, j=4-1; i < 4; i++, j--) {
		revArr[i] = arr[j];	
	
	}
	return revArr;
		
	}
}