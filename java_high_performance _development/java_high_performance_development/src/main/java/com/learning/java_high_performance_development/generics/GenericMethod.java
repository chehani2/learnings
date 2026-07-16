package com.learning.java_high_performance_development.generics;

import java.util.Arrays;
import java.util.List;

public class GenericMethod {

    public static void main(String[] args) {
        String[] words = {"carrot", "brinjal", "leek"};
        Integer[] numbers = {1, 5, 7};
        List<String> wordsList = convertArrayToList(words);
        List<Integer> numbersList = convertArrayToList(numbers);
        System.out.println(wordsList);
        System.out.println(numbersList);
    }

    private static <T> List<T> convertArrayToList(T[] array) {
        return Arrays.asList(array);
    }
    //can be pass different types/undzgenerics


}
