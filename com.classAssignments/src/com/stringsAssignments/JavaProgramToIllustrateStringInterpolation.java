package com.stringsAssignments;

import java.text.MessageFormat;

public class JavaProgramToIllustrateStringInterpolation {

	public static void main(String[] args) {

		 /* Using the ‘+’ operator
			Using  format() function
			Using MessageFormat class
			Using StringBuilder Class
		 */
		//format Method
		String name = "abc";
        int age = 25;
        double height = 170.65;
     
        String message = String.format("My name is %s, I am %d years old, and my height is %.2f meters.", name, age, height);
        System.out.println(message);
        //message format class
        String message1 = "My name is {0}, I am {1} years old, and my height is {2} meters.";
        String message2 = MessageFormat.format(message1, name, age, height);
        System.out.println(message2);
        
        

	}

}
