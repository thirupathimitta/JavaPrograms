package com.collectionInterface;

import java.util.ArrayList;
import java.util.Iterator;

public class MyThread implements Runnable {
    static ArrayList<String> al = new ArrayList<>();

    public void run() {
        try {
            Thread.sleep(3000);
            System.out.println("Child Thread Updating List");
            al.add("D");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) throws Exception {
        al.add("A");
        al.add("B");
        al.add("C");
        al.add("E");
        al.add("E");
        al.add("E");
        MyThread mt = new MyThread();
        Thread t = new Thread(mt);
        t.start();
        Thread.currentThread().setName("Navya");
        Iterator<String> itr = al.iterator();
        while (itr.hasNext()) {
            String s = itr.next();
            System.out.println("Main Thread Iterating List and current Object is " + s);
            Thread.sleep(3000);
        }
        System.out.println(al);
    }
}
