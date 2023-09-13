package com.strategyDesignPattren;

import java.lang.reflect.Field;
import java.time.LocalTime;

public class Test {

	public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException, NoSuchFieldException, SecurityException {
		
		Class<?>clz = BillCollector.class;	
		Object  obj = clz.newInstance();
		BillCollector bc= (BillCollector)obj;
		Field f = clz.getDeclaredField("p");
		f.setAccessible(true);
		f.set(bc, new CreditCard());
		bc.billPay(1500);
		
		System.out.println(LocalTime.now());
		
	}

}
