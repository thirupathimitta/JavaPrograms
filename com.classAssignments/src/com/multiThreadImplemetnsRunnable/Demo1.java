package com.multiThreadImplemetnsRunnable;

public class Demo1  extends Thread{

	@Override
	public void run() {

	
		for(int i=1;i<10;i++) {
							try {
								Thread.sleep(1000);
							} catch (InterruptedException e) {
								// TODO Auto-generated catch block
								e.printStackTrace();
							}
							System.out.println(i+"Demo1");
							
	}
}

	public static void main(String[] args) throws InterruptedException {	
		Demo1 d= new Demo1();
		Demo3 d1= new Demo3();
		Thread t1= new Thread (d);
		Thread t2 =new Thread (d1);
		
		t1.start();
		
		
		t1.setName("demo1 ");
		t2.setName("demo3");
		
		 t1.join();
		 
		t2.start();
		
		 

		for(int i=0;i<10;i++) {
			Thread.sleep(2000);
			System.out.println(i+"main");
		}
	}
}








