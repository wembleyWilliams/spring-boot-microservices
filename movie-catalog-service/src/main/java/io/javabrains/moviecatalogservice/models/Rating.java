package io.javabrains.moviecatalogservice.models;

public class Rating {

    public int rating;
    public String movieId;

    public Rating() {

    }

    public Rating(int rating, String movieId) {
        this.rating = rating;
        this.movieId = movieId;
    }

    public String getMovieId() {
        return movieId;
    }

    public void setMovieId(String movieId) {
        this.movieId = movieId;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }
}
