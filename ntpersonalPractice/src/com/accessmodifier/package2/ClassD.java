package com.accessmodifier.package2;

import com.accessmodifier.package1.ClassA;

public class ClassD  extends ClassA{

		int d =10;
		void hello3(){
			System.out.println("i am from class D");	
		}
		public static void main(String[] args) {
			ClassA A =new ClassA();
			A.hello();
		}

	
}
