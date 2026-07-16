package com.learining.java_high_performance._development.concurrency.synchronized_methods;

public class BankAccount {

    private int balance = 100;

    void debit(int amount) {
        balance -= amount;
    }

    public int getBalance() {
        return balance;
    }

}
