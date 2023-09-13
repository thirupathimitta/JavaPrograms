package com.multiThreadImplemetnsRunnable;

public class JoinMethodDemo extends Thread {
	public static void main(String[] args) throws InterruptedException {
		JoinMethodDemo j1 = new JoinMethodDemo();
		JoinMethodDemo j2 = new JoinMethodDemo();
		JoinMethodDemo j3 = new JoinMethodDemo();

		j1.start();
		j1.setName("Thread j1");
		
		System.out.println(j1);

		j2.start();
		j2.setName("Thread j2");
		j2.join();
		System.out.println(j2);

		j3.start();
		j3.setName("Thread j3");

		System.out.println(j3);

		System.out.println("main thread");

	}
}
