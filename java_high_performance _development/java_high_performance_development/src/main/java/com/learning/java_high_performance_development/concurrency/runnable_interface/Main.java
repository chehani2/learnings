package com.learining.java_high_performance._development.concurrency.runnable_interface;

public class Main {

    public static void main(String[] args) {

        Thread threadOne = new Thread(new RunnableExample());
        Thread threadTwo = new Thread(() -> System.out.println("Hello world from a lambda style runnable"));

        threadOne.setName("First thread");
        threadTwo.setName("Second thread");

        threadOne.start();
        threadTwo.start();
    }

}
