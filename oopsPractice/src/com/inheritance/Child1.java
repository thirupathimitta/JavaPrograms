package com.inheritance;

public class Child1 extends Parent1 {
	int a=500;
	void method() {
		System.out.println("child1");
	}
	 void childMethod() {
		 
		 method();
		 this.method();
		 
		 super.method();
		 
		 int a=100;
		 System.out.println(super.a);
		 System.out.println(a);
		 System.out.println(this.a);
		 
		 
	 }

}
