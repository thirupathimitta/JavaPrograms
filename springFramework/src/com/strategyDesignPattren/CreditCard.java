package com.strategyDesignPattren;

public class CreditCard implements Payment {

	@Override
	public String pay() {

		return "pay using credicard";
	}

	
}
