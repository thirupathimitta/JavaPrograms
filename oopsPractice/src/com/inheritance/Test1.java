package com.inheritance;

public class Test1 {
	int a=10;

	Child1 c=new Child1(); 

	public static void main(String[] args) {
		
		Child1 c = new Child1 ();
		
		c.childMethod();
		
		System.out.println(c.a);
		System.out.println(c.toString().equals(c));
	
		}

}
