package com.arrraysPractice;

public class ReturnArrayFromMethodproblem3 {
	static int[] method1() {
		int[] arr = {2,3,4,6,9,1,0};
		return arr;
		
	}

	public static void main(String[] args) {
		
		int[] arr1= method1();
		for(int i:arr1) {
			System.out.print(i+" ");
		}
		
	}

}
