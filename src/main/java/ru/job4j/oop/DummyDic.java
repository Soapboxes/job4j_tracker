package ru.job4j.oop;

public class DummyDic {
    public String engToRus(String eng) {
        String dontKnow = "Неизвестное слово ";
        return dontKnow + eng;
    }

    public static void main(String[] args) {
        DummyDic words = new DummyDic();
        String say = "method";
        System.out.println(words.engToRus(say));
    }
}
