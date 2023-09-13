package com.generics;

public class GenericBound<T extends Runnable> {

    void run(T runnableObject) {
        runnableObject.run();     // Call the run() method of the provided object
    }

    public static void main(String[] args) {
        GenericBound<MyRunnable> instance = new GenericBound<>();  
        MyRunnable myRunnable = new MyRunnable();
        instance.run(myRunnable); 
    }
}

class MyRunnable implements Runnable {
    public void run() {
        System.out.println("MyRunnable is running!");
    }
}
