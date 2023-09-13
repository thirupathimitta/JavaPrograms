package com.streams;

import java.util.Arrays;
import java.util.List;

public class MapExp3NumberSquareAvg {

	public static void main(String[] args) {
		
		List <Integer> l = Arrays.asList(1,2,33,4,45,66,7,8,44,49,50,60);
		
		double avg= l.stream().map(n->n*n).filter(n-> n>100).mapToInt(n->n).average().getAsDouble();
		System.out.println(avg);
	}

}
