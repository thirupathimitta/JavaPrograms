package com.defaultMethods;

public interface Test {
	
	void calling(); //by default abstract and public
	
	 default  void videoCall() {
		System.out.println("vcall feature -test");
	}
	 static void internet() {
		 System.out.println("internet feature -test");
	 }

	

}
