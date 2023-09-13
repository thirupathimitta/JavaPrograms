package com.streams;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class MainClassForStudentsMapVsFlatMap {

	public static void main(String[] args) {

		List<String> CitiesStudiedIn1 = Arrays.asList("hyd", "mumbai", "noida", "bangalore");
		Students s1 = new Students("thiru", 100, CitiesStudiedIn1);
		List<String> CitiesStudiedIn2 = Arrays.asList("hyd", "gujrat", "agra", "mumbai");
		Students s2 = new Students("ram", 101, CitiesStudiedIn2);
		List<String> CitiesStudiedIn3 = Arrays.asList("hyd", "gujrat","noida","punjab");
		Students s3 = new Students("dhoni", 100, CitiesStudiedIn3);
		List<String> CitiesStudiedIn4 = Arrays.asList("leh", "punjab", "jammu", "agra");
		Students s4 = new Students("kohli", 100, CitiesStudiedIn4);

		List<Students> studentsList = Arrays.asList(s1, s2, s3, s4);
//		System.out.println(studentsList);

		List<Integer> Ids = studentsList.stream().map(student -> student.getId()).collect(Collectors.toList());
		System.out.println(Ids);
		Set<String> cities = studentsList.stream().flatMap(student -> student.getCitesStudiedIn().stream()).collect(Collectors.toSet());
		System.out.println(cities);
		
	}

}
