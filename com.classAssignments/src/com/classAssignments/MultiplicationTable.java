package com.classAssignments;

import java.io.*;
public class MultiplicationTable {

	public static void main(String[] args) throws IOException {
		System.out.println("enter any number");
		BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
		int a =Integer.parseInt(br.readLine());

		for(int i=1;i<=10;i++) {
			System.out.println(a+" * "+i+" = "+ a*i);
		}
		

	}

}
