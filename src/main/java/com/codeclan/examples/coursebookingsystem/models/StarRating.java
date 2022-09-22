package com.codeclan.examples.coursebookingsystem.models;

public enum StarRating {
    STAR1("1"),
    STAR2("2"),
    STAR3("3"),
    STAR4("4"),
    STAR5("5");
private final String rating;

    StarRating(String rating) {
        this.rating = rating;
    }

    public String getRating() {
        return rating;
    }
}
