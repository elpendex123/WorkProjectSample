package com.coello.enrique;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.support.SpringBootServletInitializer;

// SpringBootServletInitializer is an extension of WebApplicationInitializer.
// It is needed to run a SpringApplication from a WAR deployment.
// The implementing classes are supposed to provided the source configuration class by extending configure() method.
// The configuration source class should be annotated with @SpringBootApplication or its variant.
@SpringBootApplication
public class AppServiceApplication extends SpringBootServletInitializer {
    public static void main(String[] args) {
        SpringApplication app = new SpringApplication(AppServiceApplication.class);

        app.setLogStartupInfo(true);

        app.setBanner((environment, sourceClass, out) -> {
            out.println("MY BANNER");
            out.println("MY BANNER");
            out.println("MY BANNER");
            out.println("MY BANNER");
            out.println("MY BANNER");
        });

        app.run(args);
    }
}
