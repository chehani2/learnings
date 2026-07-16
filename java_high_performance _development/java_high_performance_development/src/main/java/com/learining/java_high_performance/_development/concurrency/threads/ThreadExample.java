package com.learining.java_high_performance._development.concurrency.threads;

public class ThreadExample extends Thread {


    @Override
    public void run() {
        System.out.println("Hello world from " + this.getName());
    }


}
