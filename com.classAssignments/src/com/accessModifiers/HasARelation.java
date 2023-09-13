package com.accessModifiers;

class A{
	void show() {
		System.out.println("class A");
	}
}

public class HasARelation {
	
	A a = new A();
	
	

	public static void main(String[] args) {
		HasARelation hr = new HasARelation();
		hr.a.show();
		

	}

}
