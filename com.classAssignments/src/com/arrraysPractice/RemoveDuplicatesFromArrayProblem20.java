package com.arrraysPractice;

import java.util.Arrays;
;

public class RemoveDuplicatesFromArrayProblem20 {

	
	    public static void main(String[] args) {
	        int[] arr = {1, 2, 3, 4, 2, 5, 3, 6, 1, 7, 8, 9, 8,1,7};
	        int[] arr1 = new int[arr.length];
	        int newIndex = 0;

	        for (int i = 0; i < arr.length; i++) {
	        	
	            boolean isDuplicate = false;
	            
	            for (int j = 0; j < newIndex; j++) {
	                if (arr[i] ==arr1[j]) {
	                    isDuplicate = true;
	                    break;
	                }
	            }
	            if (!isDuplicate) {
	                arr1[newIndex] = arr[i];
	                newIndex++;
	            }
	        }

	      
	        for (int i = 0; i < arr1.length; i++) {
	            System.out.print(arr1[i]+" ");
	        }
	    

			     
	}		     
	}


