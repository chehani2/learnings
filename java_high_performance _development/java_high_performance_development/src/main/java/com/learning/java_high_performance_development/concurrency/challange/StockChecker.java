package com.learning.java_high_performance_development.concurrency.challange;

public class StockChecker {

    private int stock = 20;

    public int getStock() {
        return stock;
    }

    public void updateStock(int amount) {
        stock -= amount;
    }
}
