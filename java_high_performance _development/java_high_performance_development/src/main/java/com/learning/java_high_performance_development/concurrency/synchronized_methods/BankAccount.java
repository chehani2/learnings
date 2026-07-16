package com.learning.java_high_performance_development.concurrency.synchronized_methods;

public class BankAccount {

    private int balance = 100;

    void debit(int amount) {
        balance -= amount;
    }

    public int getBalance() {
        return balance;
    }

}
