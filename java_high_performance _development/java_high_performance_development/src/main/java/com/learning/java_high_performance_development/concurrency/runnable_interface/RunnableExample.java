package com.learning.java_high_performance_development.concurrency.runnable_interface;

public class RunnableExample implements Runnable {

    @Override
    public void run() {
        System.out.println("Hello world from a runnable");
    }
}
