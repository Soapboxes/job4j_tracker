package ru.job4j.collection;

import java.util.Comparator;

public class LexSort implements Comparator<String> {

    @Override
    public int compare(String left, String right) {
        String[] numLeft = new String[0];
        String[] numRight = new String[0];
        numLeft = left.split("\\.");
        numRight = right.split("\\.");
        int numLeftToInt = Integer.parseInt(numLeft[0]);
        int numRightToInt = Integer.parseInt(numRight[0]);
        return Integer.compare(numLeftToInt, numRightToInt);
    }
}