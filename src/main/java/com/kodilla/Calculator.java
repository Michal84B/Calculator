package com.kodilla;

public class Calculator {
    public int sum(int a, int b) {
        return a + b;
    }
    public int substract(int a, int b) {
        return a - b;
    }
    public static void main(String args[]) {
        Calculator calculator = new Calculator();
        int result = calculator.sum(5, 7);
        System.out.println("Wynik dodawania " + result);

        int result2 = calculator.substract(result, 3);
        System.out.println("Wynik odejmowania " + result2);
    }
}
