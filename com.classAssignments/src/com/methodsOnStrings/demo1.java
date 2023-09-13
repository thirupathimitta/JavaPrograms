package com.methodsOnStrings;

public class demo1 {
	
	int x=10;
	static int y=20;
	void method() {
		int x=20;
		System.out.println(x);
		System.out.println(this.x);	
		
	}
	static void method1() {
//		System.out.println(x);      //error//instance variable instance method we have to write
//		System.out.println(this.y);//error//in static method this keyword not valid
	}
	
	public static void main(String[] args) {
		demo1 d= new demo1();
		demo1 d1=new demo1();
		
		d.x= d.x+10;
		d.method();
		d1.method();
//		d1.method1();

		
	}

}
 