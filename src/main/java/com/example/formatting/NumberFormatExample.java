package com.example.formatting;

import java.text.NumberFormat;
import java.util.Locale;

public class NumberFormatExample {
    public static void main(String[] args) {
        double input = 314159.26;
        NumberFormat nf = NumberFormat.getInstance(Locale.ITALIAN);
        String b;
        //write code here so that it prints 314.159,26
        b= nf.format(input);
        System.out.println(b);
    }
}
