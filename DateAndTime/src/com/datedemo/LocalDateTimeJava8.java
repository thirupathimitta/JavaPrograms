package com.datedemo;

import java.time.LocalDateTime;

public class LocalDateTimeJava8 {

	public static void main(String[] args) {
		// Create a LocalDateTime object representing the current date and time
        LocalDateTime currentDateTime = LocalDateTime.now();
        System.out.println("Current Date and Time: " + currentDateTime);
        
        // Create a specific LocalDateTime
        LocalDateTime specificDateTime = LocalDateTime.of(2023, 8, 26, 15, 30, 0);
        System.out.println("Specific Date and Time: " + specificDateTime);
        
        // Extract components
        int year = specificDateTime.getYear();
        int month = specificDateTime.getMonthValue();
        int day = specificDateTime.getDayOfMonth();
        int hour = specificDateTime.getHour();
        int minute = specificDateTime.getMinute();
        int second = specificDateTime.getSecond();
        
        System.out.println("Year: " + year);
        System.out.println("Month: " + month);
        System.out.println("Day: " + day);
        System.out.println("Hour: " + hour);
        System.out.println("Minute: " + minute);
        System.out.println("Second: " + second);
        

	}

}
