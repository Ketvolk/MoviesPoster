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
        FilmsManager managerWithLimit = new FilmsManager(5);

        managerWithLimit.add("Матрица");
        managerWithLimit.add("Маска");
        managerWithLimit.add("Троя");

        String[] expected = {"Троя", "Маска", "Матрица"};
        String[] actual = managerWithLimit.findLast();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void ShouldFindLastUpperLimit() {
        FilmsManager managerWithLimit = new FilmsManager(3);

        managerWithLimit.add("Один дома");
        managerWithLimit.add("Аватар");
        managerWithLimit.add("Матрица");
        managerWithLimit.add("Маска");
        managerWithLimit.add("Троя");

        String[] expected = {"Троя", "Маска", "Матрица"};
        String[] actual = managerWithLimit.findLast();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void ShouldFindLastLimit() {
        FilmsManager managerWithLimit = new FilmsManager(3);

        managerWithLimit.add("Матрица");
        managerWithLimit.add("Маска");
        managerWithLimit.add("Троя");

        String[] expected = {"Троя", "Маска", "Матрица"};
        String[] actual = managerWithLimit.findLast();

        Assertions.assertArrayEquals(expected, actual);
    }
}