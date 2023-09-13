package com.exceptionsHandling;

public class UserDfndExc {

	public static void main(String[] args) {
		
		try {
			System.out.println("Creating our our own Exception Object");
			
			throw new MyException("hi");
		} catch (MyException ex) {
			System.out.println("Catch User Defined Exception");
			System.out.println(ex.getMessage());
		}

		
	}

}


