package com.lambdaexpression;

import java.util.function.Consumer;
import java.util.function.Predicate;

public class Example2 {

	public static void main(String[] args) {
		Test1 t1 = () -> System.out.println("hi");
		t1.display();

		Consumer<Integer> t2 = (x) -> System.out.println(x * x);
		t2.accept(3);

		Predicate<Integer> t3 = (x) -> {
			int cube = x * x * x;
			if (cube == 9) {
				System.out.println("It's the cube value");
				return true;
			} else {
				return false;
			}

		};
		boolean test = t3.test(3);
		System.out.println(test);
	}

}

@FunctionalInterface
interface Test1 {
	void display();

}

@FunctionalInterface
interface Test2 {
	void cube(int i);

}

@FunctionalInterface
interface Test3 {
	boolean checkCube(int i);

}

@FunctionalInterface
interface Test4 {
	String show();
}

@FunctionalInterface
interface Test5 {
	String show(int i);
}
