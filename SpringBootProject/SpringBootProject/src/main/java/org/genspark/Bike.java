package org.genspark;


import org.springframework.stereotype.Component;


public class Bike implements Vehicle{
    public void drive(){
        System.out.println("I am driving a bike...");
    }
}
