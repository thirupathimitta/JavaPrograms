package com.arrraysPractice;

public class MergeTwoArraysProblem10 {

	public static void main(String[] args) {
		
		String[] arr1 = { "chai", "coffee" };
		String[] arr2 = { "milk", "water", "coke" };
		
		String[] arr3 = new String[5];
		for(int i=0;i<arr1.length;i++) {
			arr3[i]=arr1[i];
		}
		for(int j=0;j<arr2.length;j++) {
			arr3[arr1.length+j]=arr2[j]; 
		}
		for(String x:arr3) {
			System.out.print(x+" ");
		}
		System.out.println();
		System.out.println("-------------------------------------");
		int [] a= {1,2,3,4,5};
		int[] b = {6,7,8,9};
		int []c =new int[a.length+b.length];
		for(int i=0;i<a.length;i++) {
			c[i]=a[i];
		}
		for(int i=0;i<b.length;i++) {
			c[a.length+i]=b[i];
		}
		for(int x:c) {
			System.out.print(x+" ");}
	}

}
