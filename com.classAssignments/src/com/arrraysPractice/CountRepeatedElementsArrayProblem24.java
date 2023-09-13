package com.arrraysPractice;

import java.util.Arrays;

public class CountRepeatedElementsArrayProblem24 {
	    public static void main(String[] args) {
	        int[] array = {1, 0, 2, 0, 3, 4, 5, 2, 4, 3, 1, 5, 5};

	        countRepeatedElements(array);
	    }

	    public static void countRepeatedElements(int[] array) {
	        int length = array.length;
	        boolean[] visited = new boolean[length]; // Keep track of visited elements

	        for (int i = 0; i < length; i++) {
	            if (visited[i]) {
	                continue; // Skip if the element is already visited
	            }

	            int count = 1; // Initialize count for the current element

	            for (int j = i + 1; j < length; j++) {
	                if (array[i] == array[j]) {
	                    count++;
	                    visited[j] = true; // Mark the repeated element as visited
	                }
	            }

	            if (count > 1) {
	                System.out.println("Element: " + array[i] + ", Count: " + count);
	            }
	        }
	    }
	

}


