package com.example.interfaces;

interface Sample{
    public static final int STATIC_VAR = 0;
    int STAT_VAR = 10; //public static final is implicitly assumed.

    //can interface have static method?
    static void canHaveStaticMethod(){
        System.out.println("Interface can have static method.");
    }

    // This method need body to exist in an interface
    // static void canNotHaveAbstractStaticMethod();
}
public class InterfaceExample {
}
