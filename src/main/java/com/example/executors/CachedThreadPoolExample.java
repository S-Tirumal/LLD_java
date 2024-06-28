package com.example.executors;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

/**
 Java executor framework used to create and manage thread pools for concurrent execution.
 */
public class CachedThreadPoolExample {
    public static void main(String[] args) throws InterruptedException {
        /**
         * Creates a thread pool that creates new threads as needed,
         * but will reuse previously constructed threads when they are available.
         * Ideal for short-lived task.
         */
        ExecutorService executor = Executors.newCachedThreadPool();
        Callable<String> task = () -> {
            long oneHundredMicroSeconds = 100_000;
            long startedAt = System.nanoTime();
            while (System.nanoTime() - startedAt <= oneHundredMicroSeconds);

            return "Done";
        };

        var tasks = IntStream.rangeClosed(1, 1_000_000).mapToObj(i -> task).collect(Collectors.toList());
        var result = executor.invokeAll(tasks);
    }
}
