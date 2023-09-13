package com.arrraysPractice;

import java.util.Arrays;
import java.util.Random;

public class MultiDimentionalFill2DArrayWithRandomNumbersProblem6 {

	public static void main(String[] args) {
		  int array[][] = new int[2][2];
	      Random random = new Random();

	      for (int i = 0; i < array.length; i++) {
	         for (int j = 0; j < array[i].length; j++) {
	            array[i][j] = random.nextInt();
	         }
	      }
	      System.out.println("Array: " 
	                  + Arrays.deepToString(array));
	   }

	}


