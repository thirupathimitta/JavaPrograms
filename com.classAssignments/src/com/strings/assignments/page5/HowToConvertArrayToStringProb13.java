package com.strings.assignments.page5;

import java.util.Arrays;

public class HowToConvertArrayToStringProb13 {

	public static void main(String[] args) {
		
	
			boolean[] boolArr
				= new boolean[] { true, true, false, true };
			char[] charArr
				= new char[] { 'g', 'e', 'e', 'k', 's' };
			double[] dblArr
				= new double[] { 1, 2, 3, 4 };
			int[] intArr
				= new int[] { 1, 2, 3, 4 };
			Object[] objArr
				= new Object[] { 1, 2, 3, 4 };

			System.out.println(
				"Boolean Array: "
				+ Arrays.toString(boolArr));
			System.out.println(
				"Character Array: "
				+ Arrays.toString(charArr));
			System.out.println(
				"Double Array: "
				+ Arrays.toString(dblArr));
			System.out.println(
				"Integer Array: "
				+ Arrays.toString(intArr));
			System.out.println(
				"Object Array: "
				+ Arrays.toString(objArr));
		
	

}	


}
