package ru.job4j.collection;

import ru.job4j.tracker.Item;
import ru.job4j.tracker.ItemAscByName;
import ru.job4j.tracker.ItemDescByName;

import java.util.*;

public class JobSorter {
    public static void main(String[] args) {
        List<Job> jobs = Arrays.asList(
                new Job("Fix bug", 1),
                new Job("Fix bug", 4),
                new Job("Fix bug", 2),
                new Job("X task", 0)
        );
        Collections.sort(jobs, new JobDescByName().thenComparing(new JobDescByPriority()));
        System.out.println(jobs);
        /*
        Comparator<Job> combine = new JobDescByNameLength()

                .thenComparing(new JobDescByName())
                .thenComparing(new JobDescByPriority());
        Collections.sort(jobs, combine);
        System.out.println(jobs);

        jobs.sort(new JobDescByName().thenComparing(new JobDescByPriority()));
        System.out.println(jobs);
        */
        Comparator<Job> compareName = Comparator.comparing(Job::getName);
        Comparator<Job> comparePriority = Comparator.comparingInt(Job::getPriority);
        Comparator<Job> combine = compareName.thenComparing(comparePriority);

        jobs.sort(combine);
        /*
        List<Job> jobs = Arrays.asList(
                new Job("Fix bugs", 4),
                new Job("Impl task", 2),
                new Job("Reboot server", 1));
        System.out.println(jobs);
        Collections.sort(jobs);
        System.out.println(jobs);

        List<Item> items = new ArrayList<>();
        items.add(new Item(4, "Aleksandra"));
        items.add(new Item(3, "Petr"));
        items.add(new Item(2, "Aleksandr"));
        items.add(new Item(1, "Maksim"));
        System.out.println(items);
        items.sort(new ItemAscByName());
        System.out.println(items);
        System.out.println("сортировка в обратную");
        items.sort(new ItemDescByName());
        System.out.println(items);
         */
    }
}



