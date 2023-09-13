package com.singletonDesignPattren;

public class singletonExp1 {

	public static void main(String[] args) {

		ABC obj1 = ABC.getInstance();
		System.out.println(obj1.a=20);
		System.out.println(obj1.a=30);
		
	}

}

class ABC {
	int a;
	
	 public static  ABC obj = new ABC ();//--> Eagerly instance creation 

		/*
		 * this static object will be created and it will in be on memory when class is
		 * loaded it becomes a global variable so even if u r not using object it will be
		 * there in the memory that's the one of the draw back here.
		 */	
	private ABC() {
		
		System.out.println("instance created");
	}
	
	
	public static ABC getInstance() {
		
		
		return obj;
		
	}	

}
