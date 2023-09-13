package com.inheritance;

public class Test1 {

	int a=10;
	int b=30;
	public void show() {
		System.out.println("test1 clss");

	}

}
class Test2 extends Test1{
	int a=500;
	
	void m1() {
	
	int a=20;
	System.out.println(a);
	System.out.println(this.a);
	System.out.println(super.a);
	}
}

