package com.example.concurrent;

import java.util.LinkedList;

/**
 * Also read about Banker's Algorithm https://www.geeksforgeeks.org/bankers-algorithm-in-operating-system-2/
 wait(), notify(), notifyAll() are coming from Object class. And are public final native methods.

 */
class SharedBuffer extends Object{
    private LinkedList<Integer> buffer = new LinkedList<>();
    private int capacity;

    public SharedBuffer(final int capacity) {
        this.capacity = capacity;
    }

    public void produce(int item) throws InterruptedException{
        synchronized (this){
            while (buffer.size()==capacity){
                wait();
            }
            buffer.add(item);
            notify();
        }
    }

    public int consume() throws InterruptedException{
        synchronized (this){
            while (buffer.isEmpty()){
                wait();
            }
            int item = buffer.remove();
            notify();
            return item;
        }
    }

}
public class ProducerConsumerExample {

    public static void main(String[] args) {
        SharedBuffer sharedBuffer = new SharedBuffer(5);
        //create producer thread
        new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i <= 10; i++) {
                    try {
                        sharedBuffer.produce(i);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        }).start();
        //create consumer thread
        //Will always ensure synchronization between producer and consumer.
        new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i <= 10; i++) {
                    try {
                        int item = sharedBuffer.consume();
                        System.out.println("Consumed: "+item);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        }).start();
    }

}
