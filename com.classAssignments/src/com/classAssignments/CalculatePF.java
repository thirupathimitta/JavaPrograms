package com.classAssignments;

import java.io.*;

public class CalculatePF {
	/*Q 1:Write a java program to read person basic salary and calculate Provident Fund amount from the basic salary
	Formula : Provident Fund is 12 % of Basic Salary*/

	public static void main(String[] args) throws IOException {
		
		System.out.println("enter your salary");
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		double salary = Integer.parseInt(br.readLine());
		double pf = salary *12/100;
		System.out.println("your PF amount is "+pf);

	}

}
