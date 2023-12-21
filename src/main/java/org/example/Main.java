package org.example;

import static org.example.Calculator.*;

public class Main {
    public static void main(String[] args) {
        double a = 10.0;
        double b = 5.0;

        System.out.println(add(a, b));
        System.out.println(subtract(a, b));
        System.out.println(multiply(a, b));
        System.out.println(divide(a, b));
    }
}
