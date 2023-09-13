package com.arrraysPractice;

public class AddElementToArrayProblem22 {

	public static void main(String[] args) {
		 int[] arr = {2,3,4,5,6};
		 int element =101;
		 int[] arr1= new int[arr.length+1];
		 for(int i=0;i<arr.length;i++){
			 
			 arr1[i]=arr[i];
		 } 
		 arr1[arr.length]=element;
		 
		 for(int x:arr1) {
			 System.out.print(x+" ");
		 } 

	}

}
