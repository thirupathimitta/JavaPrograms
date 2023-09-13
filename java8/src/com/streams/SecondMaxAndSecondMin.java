package com.streams;

import java.util.Arrays;
import java.util.IntSummaryStatistics;

public class SecondMaxAndSecondMin {

	public static void main(String[] args) {
		int[] arr1 = { 1, -5, 3, 14, -2, 17,19};
		
		int secMax = Arrays.stream(arr1).distinct().sorted().skip(arr1.length - 2).findFirst().orElse(0);

		int secMin = Arrays.stream(arr1).distinct().sorted().skip(1).findFirst().orElse(0);

		int sum = secMax + secMin;

		System.out.println("Second max ->" + secMax + ", Second min-> " + secMin + " \n And the Sum is  => " + sum);

	}

}
