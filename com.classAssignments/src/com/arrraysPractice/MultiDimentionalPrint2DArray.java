package com.arrraysPractice;

public class MultiDimentionalPrint2DArray {

	public static void main(String[] args) {
		 int arr[][] = { { 1, 2 }, { 4, 5 }, { 7, 8 } };
		 for(int i=0;i<arr.length;i++) {
			  for(int j =0;j<arr[i].length;j++) {
				  System.out.print(arr[i][j]+" ");
				 
			  }
		 System.out.println();
		}

	}

}
