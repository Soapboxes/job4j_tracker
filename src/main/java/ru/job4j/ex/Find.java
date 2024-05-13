package ru.job4j.ex;

public class Find {
    public static String get(String[] data, int index) {
        if (index < 0 || index >= data.length) {
            throw new IllegalArgumentException(index + " - index out of bound. "
                    + "Valid range: 0 to " + (data.length - 1));
        }
        return data[index];
    }
}
