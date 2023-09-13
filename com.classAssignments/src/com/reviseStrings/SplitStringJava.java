package com.reviseStrings;

public class SplitStringJava {
	public static void main(String[] args) {
		
		String str = "welcome-to-vtalent";
		 for(String x:str.split("-")) {
			 System.out.print(x+" ");
		 }
		 System.out.println();
		 
		 for(String x:str.split("-",2)) {//splitted 2 parts
			 System.out.print(x+" ");
		 }

	}
}
