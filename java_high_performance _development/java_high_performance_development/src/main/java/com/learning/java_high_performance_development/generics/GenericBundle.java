package com.learning.java_high_performance_development.generics;

import java.util.Arrays;
import java.util.List;

public class GenericBundle {


    public static void main(String[] args) {
        Double[] doubles = {3.0, 8.5, 4.7};
        Integer[] numbers = {8, 5, 7};
        List<Double> doublesList = convertArrayToList(doubles);
        List<Integer> numbersList = convertArrayToList(numbers);
        System.out.println(doublesList);
        System.out.println(numbersList);
    }

    private static <T extends Number> List<T> convertArrayToList(T[] array) {
        return Arrays.asList(array);
    }

}
