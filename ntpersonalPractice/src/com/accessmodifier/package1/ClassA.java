package com.accessmodifier.package1;

public class ClassA {
	int a =10;
	public int a1=20;
	private int a3 =21;
	protected int  a4 =23;
	public void hello(){
		System.out.println("i am from class A");	
	}
	public static void main(String[] args) {
		ClassA A =new ClassA();
		A.hello();
		System.out.println(A.a3);
		
	}

}
