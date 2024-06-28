package com.example.concurrent;

import java.util.concurrent.ConcurrentHashMap;

public class ConcurrentMapExample {
    private static ConcurrentHashMap<String, Integer> concurrentMap = new ConcurrentHashMap();

    public static void main(String[] args) {
        concurrentMap.put("A", 2);

        int valueA = concurrentMap.get("A");

        int valueB = concurrentMap.compute("A", (key, oldValue) -> (oldValue==null)? 1 : oldValue+1);

        concurrentMap.put("C", 2);

        // merge existing value of key "C" with new value, if null then just add
        int valueC = concurrentMap.merge("C", 1, Integer::sum);

        concurrentMap.remove("A");

        boolean containsKeyB = concurrentMap.containsKey("B");

        System.out.println(valueA);
        System.out.println(valueB);
        System.out.println(valueC);
        System.out.println(containsKeyB);

        /**
            Question:
                 which method in ConcurrentHashMap is used for inserting key-value pair
                 if the key is not already associated with value
         */
        concurrentMap.putIfAbsent("D", 5);
    }
}
