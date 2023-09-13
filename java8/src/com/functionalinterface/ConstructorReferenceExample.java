package com.functionalinterface;

public class ConstructorReferenceExample {

    public static void main(String[] args) {
        // Using constructor reference to create threads
        Thread thread1 = new Thread(new MyClass()::run);
        Thread thread2 = new Thread(new MyClass()::run);

        thread1.start();
        thread2.start();
        for(int i=0;i<20;i++) {
 		   System.out.println("Thread running: " + Thread.currentThread().getName());
 	}
        
    }
}


class MyClass implements Runnable {
    public MyClass() {
        System.out.println("Thread created using constructor reference: " + Thread.currentThread().getName());
    }

    @Override
    public void run() {
    	for(int i=0;i<20;i++) {
    		   System.out.println("Thread running: " + Thread.currentThread().getName());
    	}
    	
     
    }
}

