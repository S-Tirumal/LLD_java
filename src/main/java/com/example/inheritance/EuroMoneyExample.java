package com.example.inheritance;

class Money{
    // 'country' has private access in 'com.example.inheritance.Money'
    private String country = "Canada";
    public String getC(){
        return country;
    }
}

class Yen extends Money{
    public String getC(){
        // 'country' has private access in 'com.example.inheritance.Money'
        // return super.country;
        return super.getC();    // this is used to compile method refer prev line for question code.
    }
}

class Euro extends Money{
    public String getC(){
        return super.getC();
    }
}

public class EuroMoneyExample {
    public static void main(String[] args) {
        System.out.println(new Yen().getC() + " " + new Euro().getC());
    }

}
