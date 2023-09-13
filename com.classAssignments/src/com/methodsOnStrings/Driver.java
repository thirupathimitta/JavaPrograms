package com.methodsOnStrings;

public class Driver {

	public static void main(String[] args) {
		Driver d= new Driver();
		Person per = d.m1();
		Person p1=per;
		System.out.println(per.hashCode());
		System.out.println(p1.hashCode());
		
		System.out.println(p1.age +" "+per.age);
		

	}
	Person m1() {
		Person p = new Person();
		p.id = 101;
		p.name = "Rani";
		p.age = 32;
		System.out.println(p.hashCode());

		return p;
	}

}
