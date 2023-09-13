package com.datedemo;

import java.time.LocalTime;

public class LocatTimeInJava8 {

	public static void main(String[] args) {
		 // Create a LocalTime object representing the current time
        LocalTime currentTime = LocalTime.now();
        System.out.println("Current Time: " + currentTime);
        
        // Create a specific LocalTime
        LocalTime specificTime = LocalTime.of(15, 30, 0);
        System.out.println("Specific Time: " + specificTime);
        int hour = currentTime.getHour();
        int minute = currentTime.getMinute();
        int second = currentTime.getSecond();
        int nanosecond = currentTime.getNano();

        System.out.println("Hour: " + hour);
        System.out.println("Minute: " + minute);
        System.out.println("Second: " + second);
        System.out.println("Nanosecond: " + nanosecond);
	}

}
