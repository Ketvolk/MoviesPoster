package ru.netology.qa;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class FilmsManagerTest {
    FilmsManager manager = new FilmsManager();

    @Test
    public void ShouldAdd() {
        manager.add("Матрица");
        manager.add("Маска");
        manager.add("Троя");

        String[] expected = {"Матрица", "Маска", "Троя"};
        String[] actual = manager.findAll();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void ShouldAddNull() {
        String[] expected = {};
        String[] actual = manager.findAll();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void ShouldAddOne() {
        manager.add("Матрица");

        String[] expected = {"Матрица"};
        String[] actual = manager.findAll();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void ShouldFindLastUnderLimit() {
        manager.add("Матрица");
        manager.add("Маска");
        manager.add("Троя");

        String[] expected = {"Троя", "Маска", "Матрица"};
        String[] actual = manager.findLast();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void ShouldFindLast() {
        manager.add("Матрица");
        manager.add("Маска");
        manager.add("Троя");
        manager.add("Гладиатор");
        manager.add("Звездные войны");
        manager.add("Властелин колец");

        String[] expected = {"Властелин колец", "Звездные войны", "Гладиатор", "Троя", "Маска"};
        String[] actual = manager.findLast();

        Assertions.assertArrayEquals(expected, actual);
    }
}