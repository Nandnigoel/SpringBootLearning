package com.nandni.springbootlearning;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringBootLearningApplication {

    public static void main(String[] args) {

        var context=SpringApplication.run(SpringBootLearningApplication.class, args);
        Car car=context.getBean(Car.class);
        car.start();
    }

}
