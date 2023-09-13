package com.exceptionsHandling;

import java.io.*;

class SuperClass {

//SuperClass doesn't declare any exception
void method() throws IOException  {
	System.out.println("SuperClass");
}
}


public class SubClass extends SuperClass {

//method() declaring Checked Exception IOException
void method(int x) throws IOException{

	// IOException is of type Checked Exception
	// so the compiler will give Error

	System.out.println("SubClass");
}

//Driver code
public static void main(String args[])  {
	SuperClass s = new SubClass();
	try {
		s.method();
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}
}

