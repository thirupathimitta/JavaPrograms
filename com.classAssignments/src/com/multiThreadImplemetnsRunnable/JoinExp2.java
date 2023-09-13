package com.multiThreadImplemetnsRunnable;

public class JoinExp2 implements Runnable {

	@Override
	public  void run() {
		for (int i = 1; i < 10; i++) {
			System.out.println(Thread.currentThread().getName() + " ==>" + i);
		}

	}
	

	public static void main(String[] args) throws InterruptedException {

		JoinExp2 j = new JoinExp2();
		Runnable r = new JoinExp2();

		Thread t1 = new Thread(j);
		Thread t2 = new Thread(j);
		Thread t3 = new Thread(r);
		t1.start();
		t1.setName("thread1");

		t2.start();
		t2.setName("thread2");
		t2.join();
		t3.start();
		t3.setName("thread3");

		for (int i = 1; i < 10; i++) {
			System.out.println("main" + i);
		}

	}

}
