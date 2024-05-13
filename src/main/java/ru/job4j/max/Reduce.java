package ru.job4j.max;

public class Reduce {
    private int[] array;

    public void to(int[] array) {
        this.array = array;
    }

    public void print() {
        if (array == null) {
            throw new IllegalArgumentException("Пустой массив");
        }
        if (array.length == 0) {
            throw new IllegalArgumentException("Массив пуст.");
        }
        for (int index = 0; index < array.length; index++) {
            System.out.println(array[index]);
        }
    }

    public static void main(String[] args) {
        int[] array = {1, 2, 3};
        int[] array1 = {};
        Reduce reduce = new Reduce();
        reduce.to(array);
        reduce.print();
        reduce.to(array1);
        reduce.print();
    }
}