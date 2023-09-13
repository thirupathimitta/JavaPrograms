package com.arrraysPractice;

import java.util.Arrays;

public class RemoveElementFromArrayProblem23 {
	
	    public static void main(String[] args) {
	        int[] arr = {1, 2, 3, 3, 4, 4, 5,1};

	        // Calculate the length of the array without duplicates
	        int uniqueLength = arr.length;
	        
	        for (int i = 0; i < uniqueLength; i++) {
	            for (int j = i + 1; j < uniqueLength; j++) {
	                if (arr[i] == arr[j]) {
	                    // Shift elements to the left to overwrite the duplicate element
	                    for (int k = j; k < uniqueLength - 1; k++) {
	                        arr[k] = arr[k + 1];
	                    }
	                    uniqueLength--;
	                    j--;
	                }
	            }
	        }

	        // Create a new array without duplicates
	        int[] distinctArr = new int[uniqueLength];
	        System.arraycopy(arr, 0, distinctArr, 0, uniqueLength);

	        // Print the distinct array
	        for (int num : distinctArr) {
	            System.out.print(num + " ");
	        }
	    
	}

}
