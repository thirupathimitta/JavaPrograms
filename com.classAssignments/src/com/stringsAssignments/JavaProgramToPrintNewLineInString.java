package com.stringsAssignments;

public class JavaProgramToPrintNewLineInString {

	public static void main(String[] args) {
		
		System.out.println("hello \nworld");
		//----------------------------------//
		        String lineSeparator = System.lineSeparator();
		        String message = "Hello" + lineSeparator + "World!";
		        System.out.println(message);
		 //-------------------------------------------------
		        String message1 = "hello  %1$sworld";//%1$s
		        System.out.printf(message1, System.lineSeparator());
		 


	}

}
