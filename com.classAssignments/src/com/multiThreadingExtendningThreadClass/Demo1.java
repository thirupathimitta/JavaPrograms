package com.multiThreadingExtendningThreadClass;

public class Demo1  implements Runnable {
	

	@Override
	public void run() {		
			for(int i=0;i<5;i++) {
				System.out.println(i+ "demo1");
			}	
	}
	
	
	public static void main(String[] args) {// default thread
		
	
		Demo1 d=new Demo1();
		Thread t = new Thread(d); //user define thread
		
		 t.start();
		 t.setPriority(10);//max priority will execute
		 
		 
		 for(int i=0;i<6;i++) {
			 System.out.println(i +" main");  // default 5max 
		 }
		 
	
	}

}
