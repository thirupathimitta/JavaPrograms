package com.exceptionsHandling;

public class ExceptionHandlingExp4 {
	
	void method2(int x, int y) {
		
		System.out.println("method2 start");
		try {
		int z=x/y;
		}catch(ArithmeticException ae) {
			ae.printStackTrace();
		}
		System.out.println("method2 end");
	}
	
	public void method1(int a,int b) {
		System.out.println("method1 start");
		method2(a,b);
		
		
		System.out.println("method1 end");
	}

	public static void main(String[] args) {
		System.out.println("main method start");
		
		ExceptionHandlingExp4 e = new ExceptionHandlingExp4();
		
		e.method1(10,0);
		System.out.println("main method end");



	}

}
