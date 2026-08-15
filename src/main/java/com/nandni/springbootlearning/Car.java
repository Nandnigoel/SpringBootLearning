package com.nandni.springbootlearning;
import org.springframework.stereotype.Component;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

@Component
public class Car {

    private Engine engine;
    @Autowired
    public Car(@Qualifier("petrolEngine") Engine engine){
        this.engine=engine;
    }
    public void start(){
        engine.start();
    }
}
