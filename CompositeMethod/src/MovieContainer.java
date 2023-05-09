import java.util.ArrayList;
import java.util.List;

public class MovieContainer implements Movie{

    private List<Movie> movies = new ArrayList<>();

    @Override
    public void showMovieInfo() {
        for (Movie movie :
                movies) {
            movie.showMovieInfo();
        }
    }

    public void addMovie(Movie movie) {
        movies.add(movie);
    }
    public void removeMovie(Movie movie) {
        movies.remove(movie);
    }
}
