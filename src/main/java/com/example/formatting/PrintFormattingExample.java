package com.example.formatting;

public class PrintFormattingExample {
    public static void main(String[] args) {
        double a = 12.345;
        //insert code here so that it prints |12.345|
        System.out.printf("|%7.3f|", a); // ans

        System.out.printf("|%7f|", a);

        //java.util.IllegalFormatConversionException: d != java.lang.Double
        System.out.printf("|%7d|", a);

        //java.util.IllegalFormatPrecisionException: 7
        System.out.printf("|%3.7d|", a);
    }
}
