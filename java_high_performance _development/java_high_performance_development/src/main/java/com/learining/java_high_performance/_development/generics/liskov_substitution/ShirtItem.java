package com.learining.java_high_performance._development.generics.liskov_substitution;

public class ShirtItem extends ClothingItem {

    @Override
    int getPrice() {
        return 10;
    }

    @Override
    String getName() {
        return "Shirt";
    }
}
