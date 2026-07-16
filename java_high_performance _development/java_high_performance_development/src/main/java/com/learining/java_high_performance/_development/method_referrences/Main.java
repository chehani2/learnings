package com.learining.java_high_performance._development.method_referrences;

import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7);

        numbers.forEach((number) -> NumberUtils.evenOrOdd(number));
        //this is equal to this -->
        numbers.forEach(NumberUtils::evenOrOdd);
    }

}
