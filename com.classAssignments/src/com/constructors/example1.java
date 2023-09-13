package com.constructors;

public class example1 {
	int x;
	 example1(){
		 x=20;
		 this.x=20;
		System.out.println(x);
	}
	 example1(int a){
		 a=20;
		 System.out.println(a);
		 System.out.println(a+x);
	 }

	public static void main(String[] args) {
		
		example1 ex= new example1();
		
		
		
		example1 ex1= new example1(10);
	
		

	}

}
