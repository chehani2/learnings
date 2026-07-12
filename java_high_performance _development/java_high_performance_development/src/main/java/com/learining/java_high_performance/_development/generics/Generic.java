package com.learining.java_high_performance._development.generics;

import java.util.ArrayList;
import java.util.List;

public class Generic {

    public static void main(String[] args) {

        List<String > shapes = new ArrayList<>(); // generic casting to compiler identify the type of the genrtics
        shapes.add("Apple");
        System.out.println(shapes.get(0));
        String circle = shapes.get(0);
        shapes.add("Carrot");
        String rectangle = shapes.get(1);
    }
}
