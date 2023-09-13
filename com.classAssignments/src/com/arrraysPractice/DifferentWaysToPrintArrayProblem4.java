package com.arrraysPractice;

import java.util.*;


public class DifferentWaysToPrintArrayProblem4 {

	public static void main(String[] args) {
		//1st way using for loop
		int[] arr1 = {1, 2, 3, 4, 5};
		for (int i = 0; i < arr1.length; i++) {
		    System.out.print(arr1[i] + " ");
		}
		System.out.println();
		System.out.println("-------------foreach loop----------------------");
		//2nd way using foreach loop
		int[] arr2 = {1, 2, 3, 4, 5};

		for (int i:arr2) {
		    System.out.print(i + " ");
		    
		}
		System.out.println();
		System.out.println("-----------Using the Arrays.toString() method:------------");
		int[] arr3 = {1, 2, 3, 4, 5};
		System.out.println(Arrays.toString(arr3));
		System.out.println();
		System.out.println("-------------Arrays.Stream() method----------------------");
//		int[] arr4 = {1, 2, 3, 4, 5};
//		Arrays.stream(arr4).forEach(System.out::print);;
//		System.out.println();
//		Arrays.stream(arr4).forEach(e-> System.out.print(e+" "));;
//		System.out.println();
		
		System.out.println("-------------using while loop----------------------");	
		int[] arr5 = {1, 2, 3, 4, 5};
		int i = 0;
		while (i < arr5.length) {
		    System.out.print(arr5[i] + " ");
		    i++;
		}
		
	}

}
