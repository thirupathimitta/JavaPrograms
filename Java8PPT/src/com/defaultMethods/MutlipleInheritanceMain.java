package com.defaultMethods;

public class MutlipleInheritanceMain {

	public static void main(String[] args) {
		
		 Person p = new Person();
		 p.nature();
		 p.move();
	}

}

interface Walkable {
	
	public void nature();
	
    default void move1() {
        System.out.println("Walking");
    }
}

interface Runnable {
    default void move() {
        System.out.println("Running");
    }
}


 class Person implements Walkable, Runnable {

	

	@Override
	public void nature() {
	System.out.println("nature implemented");
		
	}

	
	
	
}
