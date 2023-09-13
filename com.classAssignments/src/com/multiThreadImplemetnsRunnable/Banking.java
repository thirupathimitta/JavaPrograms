package com.multiThreadImplemetnsRunnable;

public class Banking {

	float balance = 5000.00f;
	float amount;
	boolean condition=false;

	 synchronized void withdraw(float amount) throws InterruptedException {
		this.amount=amount;

		System.out.println("withdraw started...........");

		if (balance < amount) {
			System.out.println("you have less balance, wiat for deposit...........");
			try {
				wait();
			
			}
			catch(Exception e) {
				e.printStackTrace();
			}
		}
		Thread.sleep(6000);
		balance -= amount;
		condition=true;
		System.out.println("withdraw  completed...............");
	}  
	synchronized void deposit(float amount) throws InterruptedException {
		
		
		if(!condition) {
		
		System.out.println("deposit started..............");
		Thread.sleep(8000);
		balance +=amount;
		System.out.println("deposit completed..............");
		
		notify();
		}
	}
}
