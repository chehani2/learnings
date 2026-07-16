package com.learning.java_high_performance_development.collections;

public class LinkedHashMap {

    public static void main(String[] args) {
        java.util.LinkedHashMap<String, Integer> basket = new java.util.LinkedHashMap<>(10, 0.75f, true);

        basket.put("apple", 2);
        basket.put("orange", 1);
        basket.put("banana", 3);

        basket.get("apple");

        basket.forEach((key, value) -> System.out.println(key + ": " + value));
    }

}
