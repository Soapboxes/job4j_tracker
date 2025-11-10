package ru.job4j.collection;

import java.util.Comparator;

public class StringCompare implements Comparator<String> {
    @Override
    public int compare(String left, String right) {
        for (int i = 0; i < Math.min(left.length(), right.length()); i++) {
            char charL = left.charAt(i);
            char charR = right.charAt(i);
            if (charL != charR) {
                return Character.compare(charL, charR);
            }
        }
        return Integer.compare(left.length(), right.length());
    }
}