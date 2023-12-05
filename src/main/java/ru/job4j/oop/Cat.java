package ru.job4j.oop;

public class Cat {
    private String name;

    private String food;

    public void eat(String meat) {
        this.food = meat;
    }

    public void giveNick(String nick) {
        this.name = nick;
    }

    public void show() {
        System.out.println(this.name + " съел " + this.food);
    }

    public String sound() {
        String voice = "may - may";
        return voice;
    }

    public static void main(String[] args) {
        Cat gav = new Cat();
        Cat black = new Cat();
        String say = gav.sound();
        gav.eat("fish");
        gav.giveNick("Гав");
        gav.show();
        black.giveNick("черный");
        black.eat("корм");
        black.show();
        System.out.println("Peppy says " + say);
    }
}
