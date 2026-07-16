package com.learning.java_high_performance_development.method_referrences;

public class NumberUtils {

    static void evenOrOdd(int number) {
        if(number % 2 == 0) {
            System.out.println(number + " is even");
        } else {
            System.out.println(number + " is odd");
        }
    }

}
