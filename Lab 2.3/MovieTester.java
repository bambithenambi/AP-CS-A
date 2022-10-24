public class MovieTester {
    public static void main(String[] args) {
        Movie m1 = new Movie("Back to the Future", "Universal", "PG");
        Movie m2 = new Movie("Avengers: Endgame", "Disney", "PG-13");
        Movie m3 = new Movie("Deadpool", "Fox", "R");
        Movie m4 = new Movie("The Land Before Time", "Amblin Entertainment", "G");
        Movie m5 = new Movie("Wreck-It-Ralph", "Disney", "PG");
        System.out.println(Movie.getBasedOnRating("PG"));
    }
}
