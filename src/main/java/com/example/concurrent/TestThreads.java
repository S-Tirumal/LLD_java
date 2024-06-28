package com.example.concurrent;

class MyThread extends Thread{
    @Override
    public void run() {
        for (int i = 0; i < 3; i++) {
            System.out.println(Thread.currentThread().getId() + " Value "+ i);
        }
    }
}

public class TestThreads {
    public static void main(String[] args) {
        MyThread t1 = new MyThread();
        MyThread t2 = new MyThread();
        //order of execution is not predictable.
        t1.start();
        t2.start();
    }

}
