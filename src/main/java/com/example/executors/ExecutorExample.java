package com.example.executors;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class ExecutorExample {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ExecutorService executor = Executors.newFixedThreadPool(2);
        Callable<Integer> task = () -> {
            Thread.sleep(2000);
            return 42;
        };

        Future<Integer> future = executor.submit(task);

        // this is blocking call & throws InterruptedException, ExecutionException
        // Future.get wait for the task to complete and return result.
        Integer result = future.get();
        System.out.println(result);
        executor.shutdown();

        // New Example
        scheduleATaskToLaterTime();
    }

    // https://docs.oracle.com/javase/8/docs/api/java/util/concurrent/ScheduledExecutorService.html
    private static void scheduleATaskToLaterTime() throws ExecutionException, InterruptedException{
        ScheduledExecutorService executorService = Executors.newSingleThreadScheduledExecutor();
        Callable<Integer> task = () -> 42;
        Future<Integer> result = executorService.schedule(task, 10, TimeUnit.SECONDS);
        System.out.println(result.get());
    }
}
