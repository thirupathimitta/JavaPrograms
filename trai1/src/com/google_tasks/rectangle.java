package com.google_tasks;

public class rectangle {
	int length;
	int breadth;
	
	
	public rectangle(int l , int b){
		 length =l;
		 breadth =b;	
	}
	void area() {
		System.out.println(length*breadth);
	}
	void perimeter() {
		System.out.println(2*(length+breadth));
	}

}
