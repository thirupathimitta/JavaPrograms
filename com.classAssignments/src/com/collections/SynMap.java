package com.collections;

import java.util.*;


public class SynMap extends Thread {
	
	static Map<Integer,String> m = new HashMap<>();
	
	public  void run()
	{
		m.put(23,"Muffins");
		m.put(39, "dog");
		m.put(16,"Desserts");
		m.put(98,"Tortillas");
		m.put(7,"Biryani");
		m.put(31,"Biryani");
	System.out.println(m);
		
		try {
			Thread.sleep(10000);
		}catch(InterruptedException e) {}
			System.out.println(Thread.currentThread()+"update List" + m);	
	}
	public static void main(String[] args) throws InterruptedException {
		
		System.out.println(Thread.currentThread()+" updating map" );
		
		SynMap t1 = new SynMap();
		t1.setName("child---->thread");
		
		t1.start();
		
		Map<Integer,String> synmap = Collections.synchronizedMap(m);
		
		Thread.sleep(20000);
		synmap.put(20,"Crossiant");
		synmap.put(46,"Breads");
		synmap.put(33,"Cookies");
		
	
		Set s1=m.entrySet();
		Iterator itr = s1.iterator();
		
		while(itr.hasNext()) {
			Map.Entry m1 = (Map.Entry)itr.next();
			System.out.println(m1.getKey()+"...."+m1.getValue()+" ");
			Thread.sleep(500);
		}
	}

}
