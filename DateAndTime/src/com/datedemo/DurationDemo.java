package com.datedemo;

import java.time.Duration;
import java.time.LocalTime;

public class DurationDemo {

    public static void main(String[] args) {
        Duration dur = Duration.between(LocalTime.parse("06:00"), LocalTime.now());
        
        long hours = dur.toHours();
        long minutes = dur.toMinutes()%60;
        long seconds = dur.getSeconds()%60;
        
        System.out.printf("%d:%d:%d%n", hours, minutes, seconds);
    }

}
