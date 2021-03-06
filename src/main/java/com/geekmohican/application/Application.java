package com.geekmohican.application;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * Created by unlue on 31/10/14.
 */

@Configuration
@EnableAutoConfiguration
@ComponentScan(basePackages = "com.geekmohican")
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}
