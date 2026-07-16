package com.learining.java_high_performance._development.funtional_interface;

public class HelloWorldGreeting implements Greeting {

    @Override
    public void printMessage() {
        System.out.println("Hello World");
    }
}
