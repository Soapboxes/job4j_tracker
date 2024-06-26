package ru.job4j.io;

import java.util.Scanner;

public class Matches {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Игра 11.");
        boolean turn = true;
        int count = 11;
        while (count > 0) {
            String player = turn ? "Первый игрок" : "Второй игрок";
            System.out.println(player + " введите число от 1 до 3:");
            try {
                int matches = Integer.parseInt(input.nextLine());
                if (matches > 0 && matches <= Math.min(3, count)) {
                    count -= matches;
                    turn = !turn;
                } else {
                    System.out.println(player + " Ошибка ввода. Число от 1 до 3х, введите заново.");
                    turn = turn;
                }
            } catch (NumberFormatException e) {
                System.out.println(player + " Ошибка ввода. Введено не число!");
            }
        }
        if (!turn) {
            System.out.println("Выиграл первый игрок");
        } else {
            System.out.println("Выиграл второй игрок");
        }
    }
}
