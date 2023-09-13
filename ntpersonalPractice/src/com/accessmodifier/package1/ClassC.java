package com.accessmodifier.package1;

public class ClassC extends ClassA {
	
		int c =10;
		void hello2(){
			System.out.println("i am from class C");	
		}
		public static void main(String[] args) {
			ClassA A =new ClassA();
			A.hello();
		}
	}


