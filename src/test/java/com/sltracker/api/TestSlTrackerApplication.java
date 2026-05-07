package com.sltracker.api;

import org.springframework.boot.SpringApplication;

public class TestSlTrackerApplication {

    public static void main(String[] args) {
        SpringApplication.from(SlTrackerApplication::main).with(TestcontainersConfiguration.class).run(args);
    }

}
