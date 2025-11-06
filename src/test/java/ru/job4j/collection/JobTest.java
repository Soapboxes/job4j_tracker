package ru.job4j.collection;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public class JobTest {
    @Test
    public void whenComparatorByNameAndPriority() {
        Comparator<Job> cmpNamePriority = new JobDescByName().thenComparing(new JobDescByPriority());
        int rsl = cmpNamePriority.compare(
                new Job("Impl task", 0),
                new Job("Fix bug", 1));
        assertThat(rsl).isLessThan(0);
    }

    @Test
    public void whenCompareByAscName() {
        Comparator<Job> cmpAscName = new JobAscByName();
        int rsl = cmpAscName.compare(
                new Job("Fix bug", 1),
                new Job("X task", 0));
        assertThat(rsl).isLessThan(0);
    }

    @Test
    public void whenCompareByAscPriority() {
        Comparator<Job> cmpAscPriority = new JobAscByPriority();
        int rsl = cmpAscPriority.compare(
                new Job("Fix bug", 1),
                new Job("X task", 0));
        assertThat(rsl).isGreaterThan(0);
    }

    @Test
    public void whenCompareByDescName() {
        Comparator<Job> cmpDescName = new JobDescByName();
        int rsl = cmpDescName.compare(
                new Job("Fix bug", 1),
                new Job("X task", 0));
        assertThat(rsl).isGreaterThan(0);
    }

    @Test
    public void whenCompareByDescPriority() {
        Comparator<Job> cmpDescPriority = new JobDescByPriority();
        int rsl = cmpDescPriority.compare(
                new Job("Fix bug", 1),
                new Job("X task", 2));
        assertThat(rsl).isGreaterThan(0);
    }

    @Test
    public void whenCompareNameAndLengthEqual() {
        Comparator<Job> cmpAscName = new JobAscByName().thenComparing(new JobDescByNameLength());
        int rsl = cmpAscName.compare(
                new Job("X task", 1),
                new Job("X task", 0));
        assertThat(rsl).isEqualTo(0);
    }

    @Test
    public void whenComparatorByDescNameAndAscPriority() {
        Comparator<Job> cmpDescNameAndPr = new JobDescByName().thenComparing(new JobAscByPriority());
        int rsl = cmpDescNameAndPr.compare(
                new Job("Fix bug", 0),
                new Job("Fix bug", 1));
        assertThat(rsl).isLessThan(0);
    }

    @Test
    public void whenComparatorByDescNameDescPriority() {
        Comparator<Job> cmpDescNameAndPr = new JobDescByName().thenComparing(new JobAscByPriority());
        int rsl = cmpDescNameAndPr.compare(
                new Job("Fix bug", 1),
                new Job("X task", 0));
        assertThat(rsl).isGreaterThan(0);
    }
}