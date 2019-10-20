package com.company;

public class Swapinteger {
    public static void main(String[] args) {
        int a, b, swap;
        a = 11;
        b = 88;
        System.out.println("Before swap - "+a+", "+ + b);
        swap = a;
        a = b;
        b = swap;
        System.out.println("After swap - "+a+", "+ + b);
    }
}
