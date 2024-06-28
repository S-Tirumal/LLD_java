package com.example.polymorphism;

class Cat{
    public static void purr(){
        System.out.println("Purr..");
    }

    public String makeSound(){
        return "meow";
    }
}

class FluffyKitty extends Cat{

    public static void purr(){
        System.out.println("Fluffy Purr..");
    }
    //Overriding and Runtime polymorphism
    public String makeSound(){
        return "slow meow";
    }
    /**
     Not Allowed with compilation error
        1. attempting to use incompatible return type :
            'makeSound()' in 'com.example.polymorphism.FluffyKitty' clashes with 'makeSound()' in 'com.example.polymorphism.Cat';

         public void makeSound(){
            System.out.println("slow meow");
         }

        2. attempting to use incompatible return type :
            'purr()' in 'com.example.polymorphism.FluffyKitty' clashes with 'purr()' in 'com.example.polymorphism.Cat';

         public static String purr(){
             System.out.println("Purr..");
             return "fluffy";
         }
     */

}
public class RuntimePolymorphism {
    public static void main(String[] args) {
        Cat.purr();
        FluffyKitty.purr();
    }
}
