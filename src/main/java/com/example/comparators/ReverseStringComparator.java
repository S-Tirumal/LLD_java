package com.example.comparators;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ReverseStringComparator {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>(List.of("apple", "mango", "guava"));
        // Comparator<String> cmp = (s1, s2) -> s2.compareTo(s1);
        // This is an alternate API
        Comparator<String> cmp = Comparator.reverseOrder();
        Collections.sort(list, cmp);
        System.out.println(list);
    }
}
