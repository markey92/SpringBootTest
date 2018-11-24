package com.markey;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.SecurityAutoConfiguration;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication(exclude={SecurityAutoConfiguration.class})
@EnableScheduling
public class SpringBootStartApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringBootStartApplication.class, args);
    }
}
