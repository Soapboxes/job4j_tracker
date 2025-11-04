package ru.job4j.tracker;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.*;

class ItemAscByNameTest {

    @Test
    void compareAscByNameOk() {
        List<Item> items = new ArrayList<>();
        items.add(new Item(4, "Aleksandra"));
        items.add(new Item(3, "Petr"));
        items.add(new Item(2, "Aleksandr"));
        items.add(new Item(1, "Maksim"));
        items.sort(new ItemAscByName());
        List<Item> expected = Arrays.asList(
                new Item(2, "Aleksandr"), new Item(4, "Aleksandra"),
                new Item(1, "Maksim"), new Item(3, "Petr"));
        assertThat(items).isEqualTo(expected);
    }
}
