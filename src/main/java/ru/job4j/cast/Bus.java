package ru.job4j.cast;

public class Bus implements Vehicle {
    public static final int PAX = 40;

    @Override
    public void move() {
        System.out.println(getClass().getSimpleName() + " Двигается по скоростным трассам");
    }

    @Override
    public void passenger() {
        System.out.println(getClass().getSimpleName() + " вмещает " + PAX + " человек");
    }
}
