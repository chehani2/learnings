package com.learning.java_high_performance_development.funtional_interface;

public class HelloWorldGreeting implements Greeting {

    @Override
    public void printMessage() {
        System.out.println("Hello World");
    }
}
