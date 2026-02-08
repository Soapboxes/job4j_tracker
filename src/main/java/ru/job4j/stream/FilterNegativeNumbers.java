package ru.job4j.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FilterNegativeNumbers {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 10, 2, 7, 190, -293, -29, -2, 0);
        List<Integer> positive = numbers.stream().filter(n -> n > 0).collect(Collectors.toList());
        positive.sort(Integer::compare);
        positive.forEach(System.out::println);
    }
}
