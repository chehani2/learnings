package com.learining.java_high_performance._development.generics.activity;

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
