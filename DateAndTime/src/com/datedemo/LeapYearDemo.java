package com.datedemo;

import java.time.LocalDate;

public class LeapYearDemo {

	public static void main(String[] args) {
		boolean leapYear = LocalDate.parse("2026-12-26").isLeapYear();
//		System.out.println(leapYear);
		 LocalDate date1 = LocalDate.of(2023, 8, 25);
	        LocalDate date2 = LocalDate.of(2023, 8, 26);
	        LocalDate date3 = LocalDate.of(2023, 8, 27);
		System.out.println(date1.isBefore(date2)); // true
        System.out.println(date2.isBefore(date1)); // false

        System.out.println(date1.isAfter(date2)); // false
        System.out.println(date2.isAfter(date1)); // true

        System.out.println(date2.isBefore(date3)); // true
        System.out.println(date2.isAfter(date3)); // false

	}

}
