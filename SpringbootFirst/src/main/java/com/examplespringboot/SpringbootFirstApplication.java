package com.examplespringboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.web.bind.annotation.GetMapping;

@SpringBootConfiguration
public class SpringbootFirstApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringbootFirstApplication.class, args);
       
        
    }

   
}