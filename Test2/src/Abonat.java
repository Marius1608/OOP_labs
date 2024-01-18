import java.util.ArrayList;
import java.util.Map;

public class Abonat {

    private String subscriberId;
    private String nume;
    private Abonament abonament;
    private Map<String, Film> wishList;
    private Map<String, Film> alreadyWatchedList;


    public String getSubscriberId() {
        return subscriberId;
    }

    public String getName() {
        return nume;
    }

    public Abonament getAbonament() {
        return abonament;
    }

    public Map<String, Film> getWishList() {
        return wishList;
    }

    public Map<String, Film> getAlreadyWatchedList() {
        return alreadyWatchedList;
    }

    public void setSubscriberId(String subscriberId) {
        this.subscriberId = subscriberId;
    }

    public void setName(String nume) {
        this.nume = nume;
    }

    public void setAbonament(Abonament abonament) {
        this.abonament = abonament;
    }

    public void setWishList(Map<String, Film> wishList) {
        this.wishList = wishList;
    }

    public void setAlreadyWatchedList(Map<String, Film> alreadyWatchedList) {
        this.alreadyWatchedList = alreadyWatchedList;
    }

    public Abonat(String subscriberId, String name, Abonament abonament, Map<String, Film> wishList, Map<String, Film> alreadyWatchedList) {
        this.subscriberId = subscriberId;
        this.nume = name;
        this.abonament = abonament;
        this.wishList = wishList;
        this.alreadyWatchedList = alreadyWatchedList;
    }

    public void addToWishList(Film film) throws PremiumNotEnabledException {
        if (abonament.getTipAbonament().equals("STANDARD")) {
            throw new PremiumNotEnabledException("Nu e valabil in lista ta");
        }
        wishList.put(film.getMovieId(), film);
    }

    public void removeFromWishList(Film film) {
        wishList.remove(film.getMovieId());
    }

    public void watchMovie(Film film) throws FilmIndisponibilException {
        if (!(film.isEsteDisponibil())) {
            throw new FilmIndisponibilException("Nu e valabil");
        }
        wishList.remove(film.getMovieId());
        alreadyWatchedList.put(film.getMovieId(), film);
    }
}
