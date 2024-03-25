package com.example;

public class Function {
    public static double fahrenheitToCelsius(double fahrenheit) {
        return (fahrenheit - 32) * 5 / 9;
    }

    public static void fibonacciAndFactorial(int n) {
        int fib = fibonacci(n);
        int fact = factorial(n);
        System.out.println("Fibonacci(" + n + "): " + fib);
        System.out.println("Factorial(" + n + "): " + fact);
    }

    private static int fibonacci(int n) {
        if (n <= 1)
            return n;
        else
            return fibonacci(n - 1) + fibonacci(n - 2);
    }

    private static int factorial(int n) {
        if (n == 0)
            return 1;
        else
            return n * factorial(n - 1);
    }
}
