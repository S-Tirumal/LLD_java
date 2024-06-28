package com.example.collections;

import java.util.ArrayList;
import java.util.Collection;

public class CollectorsExample {
    /**
     * What is the purpose of using toList() in collect() API?
     */
    public static void main(String[] args) {
        // Collection is a root interface of all collections classes
        Collection<String> collection = new ArrayList<>();
        collection.add("First");

    }
}
