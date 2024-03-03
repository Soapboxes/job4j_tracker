package ru.job4j.ex;

public class FindEl {
    public static int indexOf(String[] value, String key) throws ElementNotFoundException {
        int result = -1;
        for (int index = 0; index < value.length; index++) {
            if (value[index].equals(key)) {
                result = index;
                return result;
            }
        }
        if (result == -1) {
            throw new ElementNotFoundException("Element Not Found");
        }
        return result;
    }

    public static void main(String[] args) {
        String[] list = {"key", "ball", "c"};
        try {
            FindEl.indexOf(list, "all");
        } catch (ElementNotFoundException e) {
            e.printStackTrace();
        }
    }
}


