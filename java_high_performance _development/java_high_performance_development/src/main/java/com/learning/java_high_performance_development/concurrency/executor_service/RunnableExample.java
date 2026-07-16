package com.learning.java_high_performance_development.concurrency.executor_service;

public class RunnableExample implements Runnable {

    @Override
    public void run() {
        System.out.println("Hello world from a runnable");
    }
}
