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

    public int sumAllOperation(int num) {
        return sum(num) + minus(num) + divide(num) + multiply(num);
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
        int allSum = calculator.sumAllOperation(5);
        int allSum2 = calculator.sumAllOperation(10);
        System.out.println(allSum);
        System.out.println(allSum2);
    }
}