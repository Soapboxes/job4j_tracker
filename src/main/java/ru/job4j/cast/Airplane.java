package ru.job4j.cast;

public class Airplane implements Vehicle {
    public static final int PAX = 140;

    @Override
    public void move() {
        System.out.println(getClass().getSimpleName() + " Летает по воздуху");
    }

    @Override
    public void passenger() {
        System.out.println(getClass().getSimpleName() + " вмещает " + PAX + " человек");
    }
}
