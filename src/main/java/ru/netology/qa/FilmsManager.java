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
        int lengthLast;
        if (5 > films.length) {
            lengthLast = films.length;
        } else lengthLast = 5;
        int j = 0;
        String[] temp = new String[lengthLast];
        for (int i = 0; i < temp.length; i++) {
            temp[j] = films[films.length - 1 - i];
            j++;
        }
        return temp;
    }
}