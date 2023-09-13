package com.google_tasks;
//task from this google 
//https://www.codesdope.com/practice/java-subclass/
public class childClass  extends parentClass{
	void method2() {
		System.out.println("this is child class");
	}

	public static void main(String[] args) {
	
		parentClass p =new parentClass();
		p.method1();
		childClass c = new childClass();
		c.method2();
		c.method1();
	

	}

}
