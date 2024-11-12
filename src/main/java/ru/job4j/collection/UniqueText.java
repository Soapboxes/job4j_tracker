package ru.job4j.collection;

import java.util.HashSet;

public class UniqueText {
    public boolean isEquals(String originText, String duplicateText) {
        String[] origin = originText.split(" ");
        String[] text = duplicateText.split(" ");
        HashSet<String> check = new HashSet<>();
        for (String valOrig : origin) {
            check.add(valOrig);
        }
        for (String valText : text) {
            if (!check.contains(valText)) {
                return false;
            }
        }
        return true;
    }
}