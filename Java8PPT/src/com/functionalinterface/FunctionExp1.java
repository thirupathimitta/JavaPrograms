package com.functionalinterface;

import java.util.function.BiFunction;
import java.util.function.Function;

public class FunctionExp1 {

	public static void main(String[] args) {
		Function<String, Integer> f = (name) -> name.length();

		System.out.println(f.apply("Thirupathi"));
		System.out.println(f.apply("hyd"));
		System.out.println(f.apply("sachin"));
		
		BiFunction<Integer,Integer,Integer> bi = (a,b) -> a+b;

		Integer sum = bi.apply(10,20);
	}

}
