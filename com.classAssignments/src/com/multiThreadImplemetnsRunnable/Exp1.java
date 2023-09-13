package com.multiThreadImplemetnsRunnable;

public class Exp1 implements Runnable{

	@Override
	public void run() {
		for(int i=1;i<10;i++) {
		System.out.println(i);
		}
	}
	public static void main(String[] args) {
		System.out.println("main strt");
		Exp1 e=new Exp1();
		Thread th = new Thread(e);
		
		th.start();
		
	
		th.setPriority(10);
		System.out.println("mian end");
	}

}
