package com.example.conditions;

public class IfConditionExample {
    public static void main(String[] args) {
        int x =5;
        boolean b1= true;
        boolean b2= false;

        if ((x == 2) && !b2)
            System.out.println("1 ");
        System.out.println("2 ");

        // Condition '(b2 = true) && b1' is always 'true'
        if ((b2 = true) && b1)
            System.out.print("3");
    }
}
