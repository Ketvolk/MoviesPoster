package ru.netology.qa;

public class FilmsManager {
    private String[] films = new String[0];
    private int limit = 5;

    public FilmsManager(int limit) {
        this.limit = limit;
    }

    public FilmsManager() {

    }

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
        int limitNew;
        if (limit > films.length) {
            limitNew = films.length;
        } else {
            limitNew = limit;
        }
        int j = 0;
        String[] temp = new String[limitNew];
        for (int i = films.length - 1; i > films.length - 1 - limitNew; i--) {
            temp[j] = films[i];
            j++;
        }
        return temp;
    }
}