package com.multiThreadImplemetnsRunnable;

public class Demo3 extends Thread {

	@Override
	public void run() {
		 for(int i=0;i<10;i++) {
			 try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			 System.out.println(i+ "demo3");
		 }
	}
	

}
