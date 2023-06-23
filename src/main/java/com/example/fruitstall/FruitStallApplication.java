package com.example.fruitstall;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.example.fruitstall.dao")

public class FruitStallApplication {
    public static void main(String[] args) {
        SpringApplication.run(FruitStallApplication.class, args);
    }
}
