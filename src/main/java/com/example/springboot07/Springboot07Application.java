package com.example.springboot07;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@EntityScan(basePackages = "com.example.springboot07.domain")
@SpringBootApplication
public class Springboot07Application {

    public static void main(String[] args) {
        SpringApplication.run(Springboot07Application.class, args);
    }

}

