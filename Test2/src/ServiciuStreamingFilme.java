import java.util.HashMap;
import java.util.Map;

public class ServiciuStreamingFilme {
    private Map<String, Film> movies;
    private Map<String, Abonat> subscribers;

    public ServiciuStreamingFilme() {
        this.movies = new HashMap<>();
        this.subscribers = new HashMap<>();
    }

    public void addMovie(Film film) {
        movies.put(String.valueOf(film.getMovieId()), film);
    }

    public void removeMovie(String movieId) {
        movies.remove(movieId);
    }

    public void addSubscriber(Abonat abonat) {
        subscribers.put(abonat.getSubscriberId(), abonat);
    }

    public void removeSubscriber(String subscriberId) {
        subscribers.remove(subscriberId);
    }

    public Film getMovieById(String movieId) {
        return movies.get(movieId);
    }

    public int countComedyMovies() {
        int count = 0;
        for (Film film : movies.values()) {
            if (film.getGen().equalsIgnoreCase("Comedie"))
            {
                count++;
            }
        }
        return count;
    }

}
