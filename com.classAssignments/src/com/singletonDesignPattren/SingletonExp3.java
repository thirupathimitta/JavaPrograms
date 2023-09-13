package com.singletonDesignPattren;

public class SingletonExp3 {

	public static void main(String[] args) throws InterruptedException {

		Thread t1 = new Thread(new Runnable() {

			@Override
			public void run() {

				ABCD1 obj = ABCD1.getInstance();
			}

		});
		Thread t2 = new Thread(new Runnable() {

			@Override
			public void run() {

				ABCD1 obj = ABCD1.getInstance();
			}

		});
		t1.start();
//		t1.join();
//		Thread.sleep(2);
		t2.start();

	}

}

class ABCD1 {

	public static ABCD1 obj;

	private ABCD1() {
		System.out.println("instance created");
	}

	public static ABCD1 getInstance() {
		/*
		 * if getInstance() method having huge amount of work it will decrease your
		 * performance by a factor of 100. 
		 * here synchronized at method level will
		 * decrease the performance .
		 */
		if (obj == null) {

			obj = new ABCD1(); // ---> Lazy instantiation
		}
		return obj;

	}
}
