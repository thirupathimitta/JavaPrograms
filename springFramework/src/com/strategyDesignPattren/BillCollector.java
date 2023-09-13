package com.strategyDesignPattren;


public class BillCollector {
	
	

	public Payment p;
	
	

	/*
	 * setter injection :-
	 * public void setPayment(Payment p) { this.p = p; }
	 */
	
	

	/*//constructor injection
	 * public BillCollector(Payment p) {
	 * 
	 * this.p = p; }
	 */

	public void billPay(double amount) {
		String result = p.pay();
		System.out.println(result);
	}




}
