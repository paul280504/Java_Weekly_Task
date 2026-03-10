package com.kovanlabsintern.javaweektask.UnitTesting;

public class Calculator {
    public int division(int a, int b) {
        if (b == 0) {
            throw new ArithmeticException("Cannot divide by zero");
        }
        return a / b;
    }

    public static void main(String[] args) {
        Calculator c = new Calculator();
        System.out.println(c.division(10,0));
    }
}
