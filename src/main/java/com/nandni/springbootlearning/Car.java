package com.nandni.springbootlearning;
import org.springframework.stereotype.Component;

@Component
public class Car {
    private Engine engine;
    public Car(Engine engine){
        this.engine=engine;
    }
    public void start(){
        System.out.println("Car started using Engine: "+engine);
    }
}
