package ru.job4j.tracker;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class UsagePackageDate {
    public static void main(String[] args) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
        DateTimeFormatter formTime = DateTimeFormatter.ofPattern("HH:mm:ss");
        LocalDate currentDate = LocalDate.now();
        System.out.println("Текущая дата: " + currentDate);
        LocalTime currentTime = LocalTime.now();
        System.out.println("Текущее время: " + currentTime.format(formTime));
        LocalDateTime currentDateTime = LocalDateTime.now();
        System.out.println("Текущие дата и время: " + currentDateTime.format(formatter));

    }
}