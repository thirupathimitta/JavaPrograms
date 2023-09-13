package com.functionalinterface;


interface Test{
	 public void show();
}


public class AnonymousClass{
	
	public static void main(String[] args) {
		
//		anonynmous class
		Test t = new Test() {
			public void show() {
				System.out.println("welcome to annonymous class");
			}
		};
		
		//lambda expression
		
		Test t1 = () -> System.out.println("welcome to lambda expression");
		t1.show();
		t.show();
	}
	
	

}
