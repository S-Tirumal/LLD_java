package com.example.typecasting;

class Building{}
class Barn extends Building{}

public class CompilationCastingExample {
    public static void main(String[] args) {
        Building build1 = new Building();
        Barn barn1 = new Barn();

        // Runtime Error : class case : class com.example.typecasting.Building cannot be cast to class com.example.typecasting.Barn
        Barn barn2 = (Barn)build1;

        // Compile time Exception: Inconvertible types; cannot cast 'com.example.typecasting.Building' to 'java.lang.String'
        // String str1 = (String)build1;
        Building build2 = (Building)barn1;

    }
}
