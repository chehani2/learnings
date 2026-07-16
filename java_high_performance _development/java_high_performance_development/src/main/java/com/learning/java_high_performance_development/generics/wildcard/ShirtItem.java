package com.learning.java_high_performance_development.generics.wildcard;

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
