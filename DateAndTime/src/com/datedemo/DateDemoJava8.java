package com.datedemo;

import java.time.LocalDate;

public class DateDemoJava8 {

	public static void main(String[] args) {
		
		LocalDate currentDate = LocalDate.now();
		System.out.println(currentDate);
		int dd = currentDate.getDayOfMonth();
		int mm = currentDate.getMonthValue();
		int yyyy = currentDate.getYear();
		System.out.println(dd+"-"+mm+"-"+yyyy);
		System.out.printf("this is a day %d and month %d and year %d",dd,mm,yyyy);
		
		
	}

}
