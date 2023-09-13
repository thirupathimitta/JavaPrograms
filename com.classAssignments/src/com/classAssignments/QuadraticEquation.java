package com.classAssignments;

import java.io.*;

public class QuadraticEquation {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int a =Integer.parseInt(br.readLine());
		int b=Integer.parseInt(br.readLine());
		int c=Integer.parseInt(br.readLine());
		
		
		double d = Math.sqrt(b*b -4*a*c); //Math.pow(x.0,5); you can use this aslo
		if(d>0) {
			double x1=-b+d/2*a;
			double x2 =-b-d/2*a;
			System.out.println("roots are"+x1+" and "+x2);
		} else if(d==0) {
			double x=-b/2*a;
			System.out.println("the roots are x1=x2 = "+ x);
		}
		else {
			System.out.println("the roots are imaginary");
		}
		

	}

}
