package com.lab;

public class App {
    public static int add(int a, int b) {
        return a + b;
    }

    public static void main(String[] args) {
        int a = 10;
        int b = 20;

        System.out.println("First number: " + a);
        System.out.println("Second number: " + b);
        System.out.println("Sum = " + add(a, b));
    }
}