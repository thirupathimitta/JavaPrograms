package com.arrraysPractice;

import java.util.Arrays;
import java.util.Comparator;

public class MultiDimentionalSort2DArrayInJavaProblem7 {

	public static void main(String[] args) {
		int array[][] = 
            {
              { 10, 28, 72, 91 }, 
              { 27, 33, 40, 52 }, 
              { 69, 75, 73, 72 }, 
              { 46, 33, 31, 2 } 
            };

		
		for (int[] row : array) {
            Arrays.sort(row);
        }

        // Transpose the array
        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                int temp = array[i][j];
                array[i][j] = array[j][i];
                array[j][i] = temp;
            }
        }

        // Sort each column individually
        for (int[] row : array) {
            Arrays.sort(row);
        }

        // Transpose the array back to its original form
        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                int temp = array[i][j];
                array[i][j] = array[j][i];
                array[j][i] = temp;
            }
        }

	      System.out.println(Arrays.deepToString(array));


	      
	}
}
