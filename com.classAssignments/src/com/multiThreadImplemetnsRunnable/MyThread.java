package com.multiThreadImplemetnsRunnable;

public class MyThread extends Thread {
	
	MyThread(){
		super();
	}
	
	MyThread(Runnable target){
		super(target);
	}
	
	@Override
	public void run() {
		
		
			
		System.out.println("from my thread run");
		super.run();
		
		
	}
	

}
