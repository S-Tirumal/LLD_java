package com.example.exceptions;

class A{
    static void test() throws RuntimeException{
        try {
            System.out.print("test ");
        }catch (Exception e){
            System.out.print("Exception ");
        }
    }
    static void testCaller() throws RuntimeException{
        try {
            test();
        }catch (RuntimeException e){
            System.out.print("runtime ");
        }
        System.out.print("end");
    }
}

class B{
    static void test() throws RuntimeException{
        try {
            System.out.print("test ");
            throw new RuntimeException();
        }catch (Exception e){
            System.out.print("Exception ");
        }
    }
    static void testCaller() throws RuntimeException{
        try {
            test();
        }catch (RuntimeException e){
            System.out.print("runtime ");
        }
        System.out.print("end");
    }
}


public class RuntimeExceptionTest {
    public static void main(String[] args) {
        //predict the output
        A.testCaller();

        System.out.print("\n");
        //predict the output
        B.testCaller();
    }
}
