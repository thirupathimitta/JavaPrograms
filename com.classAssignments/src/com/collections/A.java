package com.collections;

public class A {
	
	A(){
		this(20);
		System.out.println(0);
	}
	public A(int a) {
		this(90.90f);
		System.out.println(6);
	}
	public A(float a) {
		this(90.90);
		System.out.println(12);
	}
	public A(double a) {
		
		System.out.println(17);
	}
	

	public static void main(String[] args) {
		new A();

	}

}
