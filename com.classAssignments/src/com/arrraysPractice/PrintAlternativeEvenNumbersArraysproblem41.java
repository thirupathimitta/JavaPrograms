package com.arrraysPractice;

public class PrintAlternativeEvenNumbersArraysproblem41 {

	public static void main(String[] args) {
		 
			int count = 0;
		
			
			int[] arr = {5, 6,10, 9, 20, 66, 12, 16, 13, 45, 98, 39, 36 };
			for (int i = 0; i < arr.length; i++) {
				
				if (arr[i] % 2 == 0) {
					count++;
					if (count % 2 != 0) {
						System.out.print(arr[i]+" ");

					}
				}
			}

		}
	

}
