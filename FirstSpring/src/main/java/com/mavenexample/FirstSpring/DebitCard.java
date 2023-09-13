package com.mavenexample.FirstSpring;

public class DebitCard implements Payment{

	@Override
	public String Pay() {
		
		return "payment done through Debitcard";
	}
	
	

}
