package com.datedemo;

import java.time.ZoneId;

public class TimeZoneDemo {

    public static void main(String[] args) {
        ZoneId systemDefault = ZoneId.systemDefault();
        System.out.println("System Default Time Zone: " + systemDefault);

        ZoneId zoneId1 = ZoneId.of("America/New_York");
        System.out.println("Custom Time Zone: " + zoneId1);
        
        
    }
}
