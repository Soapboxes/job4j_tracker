package ru.job4j.tracker;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.*;

class ItemDescByNameTest {
    @Test
    void compareDescByNameOk() {
        List<Item> items = new ArrayList<>();
        items.add(new Item(4, "Aleksandra"));
        items.add(new Item(3, "Petr"));
        items.add(new Item(2, "Aleksandr"));
        items.add(new Item(1, "Maksim"));
        items.sort(new ItemDescByName());
        List<Item> expected = Arrays.asList(
                new Item(3, "Petr"), new Item(1, "Maksim"),
                new Item(4, "Aleksandra"), new Item(2, "Aleksandr"));
        assertThat(items).isEqualTo(expected);
    }
}
