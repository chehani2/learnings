package com.learining.java_high_performance._development.concurrency.executor_service;

public class RunnableExample implements Runnable {

    @Override
    public void run() {
        System.out.println("Hello world from a runnable");
    }
}
