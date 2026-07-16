package com.learning.java_high_performance_development.generics.activity;

public class ChildTicket extends Ticket {


    @Override
    public int getPrice() {
        return 5;
    }

    @Override
    public String toString() {
        return "Child ticket";
    }

}
