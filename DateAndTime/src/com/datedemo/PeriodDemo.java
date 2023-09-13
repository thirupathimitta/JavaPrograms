package com.datedemo;

import java.time.LocalDate;
import java.time.Period;

public class PeriodDemo {

	public static void main(String[] args) {
		
		LocalDate Dob = LocalDate.of(1995, 8, 15);
		LocalDate now = LocalDate.now();
		Period age= Period.between(Dob, now);
		System.out.printf("age id %d years %d months %d days",age.getYears(),age.getMonths(),age.getDays());
		
	}

}
