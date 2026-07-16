package com.learining.java_high_performance._development.lambda;

public class Main {

    public static void main(String[] args) {
        Greeting helloWorldGreeting = () -> System.out.println("Hello World");
        helloWorldGreeting.printMessage();

        Greeting goodMorningGreeting = () -> System.out.println("Good morning");
        goodMorningGreeting.printMessage();

        Greeting goodAfternoonGreeting = () -> System.out.println("Good afternoon");
        goodAfternoonGreeting.printMessage();
    }

}
