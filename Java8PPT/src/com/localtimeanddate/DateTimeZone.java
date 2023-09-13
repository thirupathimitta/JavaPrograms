package com.localtimeanddate;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class DateTimeZone {

	public static void main(String[] args) {
		ZonedDateTime z = ZonedDateTime.now();
		System.out.println("current india time" +z);
		LocalDateTime l=LocalDateTime.now(); 
		System.out.println("current time "+l);
		
		
		ZonedDateTime instanceInAET = z.withZoneSameInstant(ZoneId.of("AET"));
        System.out.println("Time in AET: " + instanceInAET);
		

	}

}
