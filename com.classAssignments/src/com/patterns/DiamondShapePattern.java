package com.patterns;

public class DiamondShapePattern {

	public static void main(String[] args) {
		int [] as = new int[3];
		as[0]=3250000;
		as[2]=2;
		System.out.println(as[0]);

		int size = 10;
	    // upper pyramid
	    for (int i = 1; i <= size; i++) {
	      // print spaces
	      for (int k = size; k > i; k--) {
	        System.out.print(" ");
	      }
	      // print star
	      for (int j = 0; j < i * 2 - 1; j++) {
	        System.out.print("*");
	      }
	      System.out.println();
	    }
	    // lower pyramid
	    for (int i = 1; i <= size - 1; i++) {
	      // print spaces
	      for (int k = 0; k < i; k++) {
	        System.out.print(" ");
	      }
	      // print star   
	      for (int j = (size - i) * 2 - 1; j > 0; j--) {
	    	 
	        System.out.print("*");
	      }   
	      System.out.println();
	    }
	}
}
