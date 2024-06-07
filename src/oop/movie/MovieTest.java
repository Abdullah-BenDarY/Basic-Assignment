package oop.movie;

public class MovieTest {
    public static void main(String[] args) {
        Movie casinoRoyale = new Movie("Casino Royale", "Eon Productions", "PG13");
        System.out.println("PG13 mivies:"+
                "\nTitle: " + casinoRoyale.getTitle() + ", Studio: " + casinoRoyale.getStudio() + ", Rating: " + casinoRoyale.getRating());

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
