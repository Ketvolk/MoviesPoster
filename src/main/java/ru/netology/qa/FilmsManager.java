package ru.netology.qa;

public class FilmsManager {
    private String[] films = new String[0];

    public void add(String film) {
        String[] temp = new String[films.length + 1];
        for (int i = 0; i < films.length; i++) {
            temp[i] = films[i];
        }
        temp[temp.length - 1] = film;
        this.films = temp;
    }

    public String[] findAll() {
        return films;
    }

    public String[] findLast() {
        if (5 > films.length) {
            5 = films.length;
        }
        int j = 0;
        String[] temp = new String[5];
        for (int i = films.length - 1; i > films.length - 1 - 5; i--) {
            temp[j] = films[i];
            j++;
        }
        return temp;
    }
}