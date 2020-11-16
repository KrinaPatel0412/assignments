package com.example.movies.models;

public class Movie {

    private int id;
    private String title;
    private Double ratings;
    private String description;
    private int image;

    public Movie(int id, String title, Double ratings, String description, int image) {
        this.id = id;
        this.title = title;
        this.ratings = ratings;
        this.description = description;
        this.image = image;
    }

    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public Double getRatings() {
        return ratings;
    }

    public String getDescription() {
        return description;
    }

    public int getImage() {
        return image;
    }
}