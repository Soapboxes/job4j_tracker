package ru.job4j.collection;

import java.util.Comparator;

public class DepartmentsDescComparator implements Comparator<String> {
    @Override
    public int compare(String left, String right) {
        String[] leftParts = left.split("/");
        String[] rightParts = right.split("/");
        int firstComparison = rightParts[0].compareTo(leftParts[0]);
        if (firstComparison != 0) {
            return firstComparison;
        }
        String leftRest = left.substring(leftParts[0].length());
        String rightRest = right.substring(rightParts[0].length());
        return leftRest.compareTo(rightRest);
    }
}