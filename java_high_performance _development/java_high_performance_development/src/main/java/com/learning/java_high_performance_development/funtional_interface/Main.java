package com.learning.java_high_performance_development.funtional_interface;

public class Main {

    public static void main(String[] args) {
        HelloWorldGreeting helloWorldGreeting = new HelloWorldGreeting();
        helloWorldGreeting.printMessage();
        GoodMorningGreeting goodMorningGreeting = new GoodMorningGreeting();
        goodMorningGreeting.printMessage();
    }

}
