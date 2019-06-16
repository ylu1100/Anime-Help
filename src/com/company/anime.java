package com.company;

import java.util.ArrayList;

public class anime {

    private ArrayList<String> genres;
    private String name;
    private String description;

    public anime(String name, ArrayList<String> genre, String description) {
        this.name = name;
        this.genres = genre;
        this.description=description;
    }

    public String getName() {
        return name;
    }

    public ArrayList<String> getGenres() {
        return genres;
    }
    public String getDescription() {
        return description;
    }
}