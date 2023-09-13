package com.multiThreadImplemetnsRunnable;

public class Demo extends Thread {

	public void run() {
		
		
		System.out.println("from my thread run");
		
		
	}
	public static void main(String[] args) {
//		Demo d = new Demo();
//		d.start();
//		
//		Thread th = new Thread(d);
//		th.start();
		
		 byte x = 64;
         int i;
         byte y; 
         i = x << 2;
         y = (byte) (x << 2);
         System.out.print(i + " " + y);

	}
	
	
}
