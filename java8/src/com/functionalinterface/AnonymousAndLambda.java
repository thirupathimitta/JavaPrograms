package com.functionalinterface;

interface Test1 {
	int add(int a, int b);
}

public class AnonymousAndLambda {

	public static void main(String[] args) {
		
	

		Test1 t1 = new Test1() {
			
			public int add(int a, int b) {
				return a + b;
			}
		};
		
		//lambda
		
		Test1 t2 =(a,b)-> a+b;
		
		System.out.println(t1.add(10, 20));
		System.out.println(t2.add(10, 20));
		

	}

}
