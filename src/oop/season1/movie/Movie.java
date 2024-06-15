package oop.season1.movie;

import java.util.ArrayList;

public class Movie {
    private String title;
    private String studio;
    private String rating;

    // Constructor
    public Movie(String title, String studio, String rating) {
        this.title = title;
        this.studio = studio;
        this.rating = rating;
    }

    public Movie(String title, String studio) {
        this.title = title;
        this.studio = studio;
        this.rating = "PG";
    }

    // Method to get movies with a rating of "PG"
    public static Movie[] getPG(Movie[] movies) {
        ArrayList<Movie> pgMovies = new ArrayList<>();
        for (Movie movie : movies) {
            if (movie.rating.equals("PG")) {
                pgMovies.add(movie);
            }
        }
        return pgMovies.toArray(new Movie[0]);
    }

    public String getTitle() {
        return title;
    }

    public String getStudio() {
        return studio;
    }

    public String getRating() {
        return rating;
    }
}
