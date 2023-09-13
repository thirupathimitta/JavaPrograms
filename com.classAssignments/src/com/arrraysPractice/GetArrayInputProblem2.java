package com.arrraysPractice;

import java.io.*;

public class GetArrayInputProblem2 {

	public static void main(String[] args) throws IOException{
		
		InputStreamReader IR=	new InputStreamReader(System.in);
		
		BufferedReader br = new BufferedReader(IR);
		
		int[] arr= new int[5];
		
		for(int i=0;i<arr.length;i++) {
			
			System.out.print("enter the value of index "+ "["+i+"]");
		arr[i] =Integer.parseInt (br.readLine());
		
		}
		
		for(int x:arr) {
			System.out.print(x+" ");
		}
	}

}
