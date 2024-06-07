package oop.movie;

public class MovieTest {
    public static void main(String[] args) {
        // Create an instance of the class Movie with the specified values
        Movie casinoRoyale = new Movie("Casino Royale", "Eon Productions", "PG13");
        System.out.println("Movie: " + casinoRoyale.getTitle() + ", Studio: " + casinoRoyale.getStudio() + ", Rating: " + casinoRoyale.getRating());

        // Example usage of getPG method
        Movie[] movies = {
                new Movie("Casino Royale", "Eon Productions", "PG13"),
                new Movie("Finding Nemo", "Pixar", "PG"),
                new Movie("The Lion King", "Disney", "PG"),
                new Movie("Inception", "Warner Bros.", "PG13")
        };
        Movie[] pgMovies = Movie.getPG(movies);
        System.out.println("PG Movies:");
        for (Movie movie : pgMovies) {
            System.out.println("Title: " + movie.getTitle() + ", Studio: " + movie.getStudio() + ", Rating: " + movie.getRating());
        }
    }
}
