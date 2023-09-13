 package com.streams;

import java.util.Arrays;
import java.util.List;

public class FlatMapExp {

	public static void main(String[] args) {
		List <String> UiList= Arrays.asList("html","css","bs","js","rs");
		List <String> javaList= Arrays.asList("coe java","adv java","spring","springboot");

		List<List<String>> courses = Arrays.asList(UiList,javaList);
		
		courses.stream().flatMap(s->s.stream()).forEach(System.out::println);
	}

}
