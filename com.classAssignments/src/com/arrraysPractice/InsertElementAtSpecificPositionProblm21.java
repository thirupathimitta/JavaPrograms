package com.arrraysPractice;

import java.util.Arrays;

public class InsertElementAtSpecificPositionProblm21 {
    public static void main(String[] args) {
	        int[] myArray = {1, 2, 3, 4, 5};
	        int element = 10;
	        int position = 2;
	        int[] newArray = insertElementAtPosition(myArray, element, position);

	        // Print the new array
	        for (int num : newArray) {
	            System.out.print(num + " ");
	        }
	        System.out.println();
	    }

	    public static int[] insertElementAtPosition(int[] arr, int element, int position) {
	        int[] newArray = new int[arr.length + 1];

	        // Copy elements before the specified position
	        for (int i = 0; i < position; i++) {
	            newArray[i] = arr[i];
	        }

	        newArray[position] = element; // Insert the new element at the specified position

	        // Copy elements after the specified position
	        for (int i = position; i < arr.length; i++) {
	            newArray[i + 1] = arr[i];
	        }

	        return newArray;
	    }
	}



