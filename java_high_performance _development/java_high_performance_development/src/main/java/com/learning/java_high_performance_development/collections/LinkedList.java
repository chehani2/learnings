package com.learining.java_high_performance._development.collections;

public class LinkedList {

    public static void main(String[] args) {

        java.util.LinkedList<String> list = new java.util.LinkedList<>();
        list.add("first item");
        list.add("second item");
        System.out.println(list);

        System.out.println(list.getFirst());
        System.out.println(list.getLast());

        System.out.println(list.poll());
        System.out.println(list);

        System.out.println(list.pop());
        System.out.println(list);

        System.out.println(list.poll());
        System.out.println(list.pop());

    }
}
