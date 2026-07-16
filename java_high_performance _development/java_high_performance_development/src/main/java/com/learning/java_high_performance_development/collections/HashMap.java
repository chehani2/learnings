package com.learining.java_high_performance._development.collections;

public class HashMap {

    static java.util.HashMap<String, Integer> basket = new java.util.HashMap<>();

    public static void main(String[] args) {
        java.util.HashMap<String, Integer> basket = new java.util.HashMap<>();

        basket.put("apple", 1);
        System.out.println(basket.get("apple"));

        basket.put("apple", 2);
        System.out.println(basket.get("apple"));

        System.out.println(basket.containsKey("apple"));

        basket.merge("apple", 1, Integer::sum);
        basket.merge("orange", 1, Integer::sum);

        System.out.println(basket.get("apple"));
        System.out.println(basket.get("orange"));
    }
}
