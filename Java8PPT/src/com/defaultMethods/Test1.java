package com.defaultMethods;

public interface Test1 {
	void calling(); //by default abstract and public
	
	 default  void videoCall() {
		System.out.println("vcall feature test1");
	}
}
