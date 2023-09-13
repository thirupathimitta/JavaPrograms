package com.defaultMethods;

import java.util.Collections;
import java.util.List;

public class Jio implements Test,Test1 {

	@Override
	public void calling() {
		System.out.println("jio calling feature");
		
	}



	@Override
	public void videoCall() {
		System.out.println("jio video call feature");
	}
	
	void abc(){
		int x=10;
		int y=20;
		System.out.println(x+y);
		Test.super.videoCall();
		
	}

	

}
