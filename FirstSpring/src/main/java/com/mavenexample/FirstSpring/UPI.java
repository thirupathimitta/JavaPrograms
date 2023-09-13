package com.mavenexample.FirstSpring;

public class UPI implements Payment{

	@Override
	public String Pay() {
		
		return "payment done through UPI";
	}
	
}
