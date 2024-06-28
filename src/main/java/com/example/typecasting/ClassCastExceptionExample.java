package com.example.typecasting;

interface Foo{}

class Alpha implements Foo{}

class Beta extends Alpha{}

class Delta extends Beta{}

public class ClassCastExceptionExample {
    public static void main(String[] args) {
        Beta x = new Beta();
        //Not valid : As Beta cannot be cast to class com.example.typecasting.Delta
        Foo f = (Delta)x;

        Beta b = (Beta) (Alpha) x;

        Foo f1 = (Alpha) x;

        Alpha a = x;

        System.out.println(x);
    }
}
