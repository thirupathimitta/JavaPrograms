package com.functionalinterface;

public class Demo {

	

	public static void main(String[] args) {
		
		Test1 t1 = ()->System.out.println("Test1 implementted");
		t1.show();
	

	}


}

@FunctionalInterface
 interface  Test1 {
	int a=20;
	 void show();	
	 default void method() {
		 System.out.println("deault method in function interface");
	 }	
	 
	 
	 String toString();
	 
 }

