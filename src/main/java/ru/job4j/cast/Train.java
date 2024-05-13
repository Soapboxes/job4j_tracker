package ru.job4j.cast;

public class Train implements Vehicle {
    public static final int PAX = 400;

    @Override
    public void move() {
        System.out.println(getClass().getSimpleName() + " Передвигается по рельсам");
    }

    @Override
    public void passenger() {
        System.out.println(getClass().getSimpleName() + " вмещает " + PAX + " человек");
    }
}
