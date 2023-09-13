package com.examplespringboot;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component; // Correct annotation

@Component // Correct annotation
public class CacheManager implements ApplicationRunner {

    @Override
    public void run(ApplicationArguments args) throws Exception {
        System.out.println("Logic for getting data from the database");
        // You can place your cache initialization or data retrieval logic here
    }
}
