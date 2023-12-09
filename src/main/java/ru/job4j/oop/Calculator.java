package ru.job4j.oop;

public class Calculator {

    private static int x = 5;

    public static int sum(int y) {
        return x + y;
    }

    public static int minus(int numMinus) {
        return numMinus - x;
    }

    public int divide(int numDiv) {
        return numDiv / x;
    }

    public int multiply(int a) {
        return x * a;
    }

    public int sumAllOperation(int sum, int minus, int multiply, int divide) {
        return Calculator.sum(sum) + Calculator.minus(minus) + divide(divide) + multiply(multiply);
    }

    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        int result = Calculator.sum(10);
        System.out.println(result);
        int rsl = calculator.multiply(5);
        System.out.println(rsl);
        int resMin = Calculator.minus(1);
        System.out.println(resMin);
        int rslDivide = calculator.divide(2);
        System.out.println(rslDivide);
        int allSum = calculator.sumAllOperation(result, rsl, resMin, rslDivide);
        int allSum2 = calculator.sumAllOperation(10, 1, 5, 2);
        System.out.println(allSum);
        System.out.println(allSum2);
    }
}