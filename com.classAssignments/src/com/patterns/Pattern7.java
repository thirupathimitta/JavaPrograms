package com.patterns;

public class Pattern7 {

	public static void main(String[] args) {
		
		int n=5;
		for(int i=1;i<=n; i++) {
			
			for(int j=1;j<=n-i;j++) { //j=i;j<=n (or)j=1;j<=n-i
				System.out.print(" ");
			}
			
			for(int k=1;k<=i;k++) {
				
				System.out.print(k+" ");
			}
			System.out.println();
		}
	}

}
