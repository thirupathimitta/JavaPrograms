package com.localtimeanddate;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;

public class LocalDateExample {

	public static void main(String[] args) {
		LocalDate CurrentDate = LocalDate.now();
		
		System.out.println(CurrentDate);
		
		LocalTime currentTime = LocalTime.now();
		System.out.println(CurrentDate+ " " + currentTime);
		
		System.out.println(LocalDateTime.now());
		
		System.out.println(CurrentDate.plusDays(30));
		
		System.out.println(CurrentDate.minusDays(30));
		
		LocalDateTime now = LocalDateTime.now();
		
		 LocalDateTime str1 = LocalDateTime.of(2000, Month.JANUARY, 1,1,1);
		 
		System.out.println(Duration.between(str1,now).toDays());	
		
		 LocalDateTime date = LocalDateTime.parse("22-08-1995");
		 System.out.println(date);
		 
		    
		
		
	}

}