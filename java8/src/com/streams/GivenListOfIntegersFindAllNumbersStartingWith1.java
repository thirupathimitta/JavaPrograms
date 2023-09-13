package com.streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class GivenListOfIntegersFindAllNumbersStartingWith1 {
	public static void main(String[] args) {

		List<Integer> list = Arrays.asList(10, 20, 12, 11, 45, 23, 12, 15, 46, 34, 34, 23, 33);
		list.stream().map(n -> n + "").filter(n -> n.startsWith("1")).forEach(System.out::println);

	}

}
