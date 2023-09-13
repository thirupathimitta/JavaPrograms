package com.arrraysPractice;

public class MultiDimentionalRowSumAndColumnSumOfMatrixProblem5 {

	public static void main(String[] args) {

		int[][] arr = {
				{1,4,8},
				{9,7,2},
				{7,6,4}		
		};
		int rowSum=0;
	    int columnSum=0;

	  
	    for (int i = 0; i < 3; i++) {

	  

	      for (int j = 0; j < 3; j++) {
	        rowSum += arr[i][j];
	        columnSum += arr[j][i];
	      }
	      System.out.println("Row--->" + (i + 1) + " sum = " + rowSum);
	      System.out.println("Column--->" + (i + 1) +  " sum = " + columnSum);

	}
	  
	}

}
