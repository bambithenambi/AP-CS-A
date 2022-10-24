import java.lang.reflect.Array;
import java.util.ArrayList;

public class Movie {
    private String title;
    private String studio;
    private String rating;
    static ArrayList<Movie> movies = new ArrayList<>();

    public Movie(String title, String studio, String rating) {
        this.title = title;
        this.studio = studio;
        this.rating = rating;
        movies.add(this);
    }
    public Movie(String title, String studio) {
        this.title = title;
        this.studio = studio;
        this.rating = "PG";
        movies.add(title);
    }
    public String toString() {
        String res = "";
        res+= "Title: "+this.title+"\n";
        res+= "Studio: "+this.studio+"\n";
        res+= "Rating: "+this.rating+"\n";
        return res;
    }
    public static ArrayList<Movie> getBasedOnRating(String rating) {
        ArrayList<Movie> res = new ArrayList<>();
        for (Movie movie: movies) {
            if (movie.rating.equals(rating)) {
                res.add(movie);
            }
        }
        return res;
    }
}
