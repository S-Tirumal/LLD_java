package com.example.statics;

public class StaticVariableExample {
    static int x = 10;
    public static void main(String[] args) {
        StaticVariableExample staticVariableExample1 = new StaticVariableExample();
        StaticVariableExample staticVariableExample2 = new StaticVariableExample();

        staticVariableExample1.x = 20;
        System.out.println(staticVariableExample1.x + " " + staticVariableExample2.x);

        StaticVariableExample staticVariableExample3 = new StaticVariableExample();
        staticVariableExample3.display();
    }

    static void display(){
        System.out.println("Static method.");
    }
}
