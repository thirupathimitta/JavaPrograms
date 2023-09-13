package com.multiThreadImplemetnsRunnable;


public class Test {
	public static void main(String[] args) {
//		Thread th1 =new Thread();
//		th1.start();
//		System.out.println("hi");
		
		/*
		 * MyThread mt = new MyThread(); mt.start();
		 * 
		 * 
		 * MyRunnable mr = new MyRunnable(); Thread th2= new Thread(mr); th2.start();
		 */
		 
		  
		 
//		  
//		  Thread th3 = new Thread(mt);
//		  th3.start();
//		  
//		  Thread th4 = new MyThread(); 
//		  th4.start();
		 
		
//		Thread th5 = new MyRunnable();
		
//		Runnable r = new MyRunnable();
//		r.start();
		MyRunnable mr= new MyRunnable();
		
		MyThread mt = new MyThread(mr);
	
		mt.start();
		
//		MyThread mt = new MyThread();
//		MyThread mt4= new MyThread(mt);		
//		mt4.start();
		
		
		
	}

}
