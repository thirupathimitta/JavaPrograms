package com.classAssignments;

import java.io.*;

public class FibonacciSeriesForloop {

	public static void main(String[] args) throws IOException {
		System.out.println("enter number ot terms:-");
		BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
		int a =Integer.parseInt(br.readLine());
		int b =0;
		int c =1;
		System.out.print(b+" "+c+" ");
		for(int i=3;i<=a;i++) {
			int d= b+c;
			System.out.print(d+" ");
			b=c;
			c=d;		
		}

	}

}
