package com.example.executors;

import java.util.Arrays;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

/**
 Read about Fork-join framework as well https://www.baeldung.com/java-fork-join
 */
public class ParallelMergeSort implements Callable<int[]> {
    private int[] array;

    public ParallelMergeSort(final int[] array) {
        this.array = array;
    }

    @Override
    public int[] call() throws Exception {
        if (array.length <=1 ){
            return array;
        }

        int mid = array.length/2;

        int[] left = Arrays.copyOfRange(array, 0, mid);
        int[] right = Arrays.copyOfRange(array, mid, array.length);

        ExecutorService executorService = Executors.newFixedThreadPool(2);

        Callable<int[]> leftTask = new ParallelMergeSort(left);
        Callable<int[]> rightTask = new ParallelMergeSort(right);

        Future<int[]> leftResult = executorService.submit(leftTask);
        Future<int[]> rightResult = executorService.submit(rightTask);

        int[] merged = merge(leftResult.get(), rightResult.get());

        executorService.shutdown();

        return merged;
    }

    private int[] merge(int[] left, int[] right){
        //write array merge code
        return left;
    }

    public static void main(String[] args) {
        int[] arr = {1, 3, 2, 9, 6, 8, 4};

        Callable<int[]> task = new ParallelMergeSort(arr);
        ExecutorService executorService = Executors.newSingleThreadExecutor();

        Future<int[]> leftResult = executorService.submit(task);
        try {
            int[] sortedArr = leftResult.get();
        } catch (InterruptedException | ExecutionException e) {
            e.printStackTrace();
        } finally {
            executorService.shutdown();
        }

    }
}
