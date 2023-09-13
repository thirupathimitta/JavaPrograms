package com.singletonDesignPattren;

public class SingletonExp2 {

	public static void main(String[] args) {
		
		ABCD obj = ABCD.getInstance() ;
		ABCD obj1 = ABCD.getInstance() ;
		
		/*
		 * here we have one thread it will execute one bye one sequencially. what if i
		 * created two threads will getInstace method at a time then both thread obj
		 * have null , both will create instance
		 */
	}

}
class ABCD {
	
	 public static  ABCD obj ;

		
	private ABCD() {
		System.out.println("instance created");
	}
	
	
	public static ABCD getInstance() {
		
		if(obj==null) {
		
		 obj = new ABCD(); //---> Lazy instantiation
		}
		return obj;
		
	}
}

