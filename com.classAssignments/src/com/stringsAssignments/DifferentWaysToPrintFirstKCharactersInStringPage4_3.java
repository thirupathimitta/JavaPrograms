package com.stringsAssignments;

public class DifferentWaysToPrintFirstKCharactersInStringPage4_3 {

	public static void main(String args[]) {
		
		String str = "Geekss for geeks";
		
		int k = 6;
		
		if(str.length()>k) {
		for(int i=0;i<k;i++) {
			System.out.print(str.charAt(i)+"");
		}}else System.out.print(str);

	}
	//another way
//we can use substring method or use Math.min() function
	
}
