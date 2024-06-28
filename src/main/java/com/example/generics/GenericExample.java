package com.example.generics;

import java.util.Arrays;
import java.util.List;

/**
 "?" wild card represents an unknown type.
 To declare an upper-bounded wildcard, use the wildcard character ('?'), followed by the extends keyword, followed by its upper bound.
 List<? extends Number> This accepts List<Integer>, List<Double>, and List<Number> as Number is parent abstract class to Int, Double, Number.
 */
public class GenericExample {
    public static void main(String[] args) {
        List<Integer> intList = Arrays.asList(1, 2, 3, 4);
        List<Double> doubleList = Arrays.asList(1.2, 2.1, 3.1, 4.5);
        sumOfList(intList);
        sumOfList(doubleList);
    }

    private static double sumOfList(java.util.List<? extends Number> list){
        double sum = 0;
        for (Number n: list) {
            sum += n.doubleValue();
        }
        return sum;
    }
}
