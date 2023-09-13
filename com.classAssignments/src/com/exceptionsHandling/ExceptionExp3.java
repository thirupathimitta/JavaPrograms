package com.exceptionsHandling;

public class ExceptionExp3 {
	
	public static void main(String[] args) {
		System.out.println("main( ) method started...");
		try {
			System.out.println("try block start");
			String s = "hi";
			int i = s.length();
			System.out.println("try block end"+i);
			int c= i/0;
			System.out.println(c);
			
		} catch (ArithmeticException e) {
			System.out.println("in catch block");
			e.printStackTrace();
		} catch (NullPointerException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("main( ) method ended...");
	}

}
