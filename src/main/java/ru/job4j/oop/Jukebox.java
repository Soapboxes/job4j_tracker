package ru.job4j.oop;

public class Jukebox {
    public void music(int position) {
        switch (position) {
            case 1 -> System.out.println("Пусть бегут неуклюже");
            case 2 -> System.out.println("Спокойной ночи");
            default -> System.out.println("Песня не найдена");
        }
    }

    public static void main(String[] args) {
        Jukebox songPosition = new Jukebox();
        songPosition.music(1);
        songPosition.music(2);
        songPosition.music(0);

        for (int i = 0; i <= 2; i++) {
            System.out.println();
            songPosition.music(i);
        }
    }
}
