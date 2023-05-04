package com.spike.sortingalgorithmsv2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.spike.sortingalgorithmsv2.*")
public class SortingAlgorithmsV2Application {

    public static void main(String[] args) {
        SpringApplication.run(SortingAlgorithmsV2Application.class, args);
    }

}
