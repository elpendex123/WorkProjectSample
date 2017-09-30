package com.coello.enrique;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.support.SpringBootServletInitializer;

@SpringBootApplication
public class AppServiceApplication extends SpringBootServletInitializer {
    public static void main(String[] args) {
        System.out.println("Hello World");
        SpringApplication.run(AppServiceApplication.class, args);
        System.out.println("Bye World");
    }
}