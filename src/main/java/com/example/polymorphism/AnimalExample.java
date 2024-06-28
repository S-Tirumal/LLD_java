package com.example.polymorphism;

public class AnimalExample {
    class Animal {
        void makeSound(){
            System.out.println("Some sound");
        }
    }

    class Dog extends Animal {
        //Answer: This is method overriding hence Runtime polymorphism.
        void makeSound(){
            System.out.println("Dog sound");
        }
    }
}
