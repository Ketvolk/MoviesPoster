package ru.netology.qa;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class FilmsManagerTest {

    @Test
    public void ShouldAdd() {
        FilmsManager manager = new FilmsManager();
        manager.add("Матрица");
        manager.add("Маска");
        manager.add("Троя");

        String[] expected = {"Матрица", "Маска", "Троя"};
        String[] actual = manager.findAll();
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void ShouldAddNull() {
        FilmsManager manager = new FilmsManager();

        String[] expected = {};
        String[] actual = manager.findAll();
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void ShouldAddOne() {
        FilmsManager manager = new FilmsManager();
        manager.add("Матрица");
        String[] expected = {"Матрица"};
        String[] actual = manager.findAll();
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void ShouldFindLastUnderLimit() {
        FilmsManager manager = new FilmsManager();
        manager.add("Матрица");
        manager.add("Маска");
        manager.add("Троя");

        String[] expected = {"Троя", "Маска", "Матрица"};
        String[] actual = manager.findLast(5);
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void ShouldFindLast() {
        FilmsManager manager = new FilmsManager();
        manager.add("Матрица");
        manager.add("Маска");
        manager.add("Троя");
        manager.add("Гладиатор");
        manager.add("Звездные войны");
        manager.add("Властелин колец");

        String[] expected = {"Властелин колец", "Звездные войны", "Гладиатор", "Троя", "Маска"};
        String[] actual = manager.findLast(5);
        Assertions.assertArrayEquals(expected, actual);
    }
}