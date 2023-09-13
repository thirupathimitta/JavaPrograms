package com.multiThreadImplemetnsRunnable;

public class Customer2 extends Thread {

	
	
	Customer2(Banking b){
		this.b=b;
 		
 	}
	
	 Banking b;
	 
	 	@Override
	public void run() {
	 		
	 		try {
				b.deposit(10000.00f);
			} catch (InterruptedException e) {
				
				e.printStackTrace();
			}
		
 	}
}
