package ru.job4j.concat;

public class ConcatTest {
    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();
        StringBuilder string = new StringBuilder("Job4j");
        StringBuilder builder = new StringBuilder("abc");
        builder.append("def").append("ghi");
        String string1 = "abc".concat("def").concat("ghi").concat("jkl");
        System.out.println(string);
        for (int index = 0; index < 9999; index++) {
            string.append(index);
        }
        System.out.println(builder);
        System.out.println(string1 + " \n + \\ ");
        System.out.println("Миллисекунд: " + (System.currentTimeMillis() - startTime));
    }
}