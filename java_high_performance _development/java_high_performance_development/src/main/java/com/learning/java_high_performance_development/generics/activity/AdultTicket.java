package com.learning.java_high_performance_development.generics.activity;

public class AdultTicket extends Ticket {

    @Override
    public int getPrice() {
        return 10;
    }

    @Override
    public String toString() {
        return "Adult ticket";
    }

}
