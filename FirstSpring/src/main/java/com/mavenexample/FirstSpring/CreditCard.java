package com.mavenexample.FirstSpring;

public class CreditCard implements Payment {

	@Override
	public String Pay() {
		
		return "payment done through Creditcard";
	}
}
