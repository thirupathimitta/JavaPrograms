package com.singletonDesignPattren;
public class SingletonExp4{

	public static void main(String[] args) throws InterruptedException {

		Thread t1 = new Thread(new Runnable() {

			@Override
			public void run() {

				ABCD2 obj = ABCD2.getInstance();
			}

		});
		Thread t2 = new Thread(new Runnable() {

			@Override
			public void run() {

				ABCD2 obj = ABCD2.getInstance();
			}

		});
		t1.start();
//		t1.join();
//		Thread.sleep(2);
		t2.start();

	}

}

class ABCD2 {

	public static ABCD2 obj;

	private ABCD2() {
		System.out.println("instance created");
	}

	public static ABCD2 getInstance() {
		
		if (obj == null) {
			synchronized(ABCD2.class) {  //Double checked locking
				if(obj==null) {

			obj = new ABCD2(); // ---> Lazy instantiation
				}
			}
		}
		return obj;

	}
}

