package com.lambdaexpression;

import java.util.Comparator;

@FunctionalInterface
interface demo {
	void sum(int a, int b);

}

class A implements demo {

	@Override
	public void sum(int a, int b) {
		int x = a + b;
		System.out.println(x);

	}

}

public class Example1 {

	public static void main(String[] args) {
		
		

	}

}
//demo d = new demo();
//demo d1 = new A();
//--------------------------------------------------------		
/*
 * demo d2 = new demo() {
 * 
 * @Override public void sum(int a, int b) { int x= a+b; System.out.println(x);
 * 
 * } }; d2.sum(2,3);
 */
//------------------------------------	

/*
 * demo d2 = (a,b)->{ int x= a+b; System.out.println(x); }; d2.sum(2, 3);
 */
