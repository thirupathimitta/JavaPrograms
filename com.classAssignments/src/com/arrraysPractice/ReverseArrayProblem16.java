package com.arrraysPractice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ReverseArrayProblem16 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		/*
		 * BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		 * System.out.println("enter the size of array"); int size =
		 * Integer.parseInt(br.readLine()); int[] arr = new int[size];
		 * System.out.println("enter ArrayValues"); for (int i = 0; i < arr.length; i++)
		 * { arr[i] = Integer.parseInt(br.readLine()); }
		 */
		
		int[] arr= {1,4,5,7,2,7,8};
	
		
		for(int i=0;i<arr.length/2;i++) {
			
			int  temp=arr[i];
			 
			arr[i]=arr[arr.length-1-i];
			
			arr[arr.length-1-i]=temp;
			
		}
		for(int x:arr) {
			System.out.print(x+" ");
		}
	}
}
