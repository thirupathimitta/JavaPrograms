package com.methodsOnStrings;

import java.util.Arrays;

public class ConvertingStringToIntergerArray {

	public static void main(String[] args) {
		String str = "[1,2,356,678,3378]";
		
		ConvertingStringToIntergerArray  ob=new ConvertingStringToIntergerArray ();
		int [] array = ob.convertionMethod(str);
		System.out.println(Arrays.toString(array));

	}
	private int[] convertionMethod(String str) {
		String [] arr= str.substring(1, str.length()-1).split(",");
		int[] arr1 = new int[arr.length];
		for(int i=0;i<arr.length;i++) {
			arr1[i] =Integer.parseInt( arr[i]);
		}

		return arr1;
	}

}
