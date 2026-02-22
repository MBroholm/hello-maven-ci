package com.example;

public class App {
    public static void main(String[] args) {
        System.out.println("Hello from Maven with CI!");
        System.out.println("5 + 3 = " + add(5, 3));
    }

    public static int add(int a, int b) {
        return a + b;
    }

    public static int multiply(int a, int b) {
        return a * b;
    }
}
