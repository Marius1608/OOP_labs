import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {

        ServiciuStreamingFilme streaming = new ServiciuStreamingFilme();

        Film film1 = new Film("111", "Femeia Rege", "Actiune", 220, true);
        Film film2 = new Film("113", "Forest Gump", "Drama", 280, true);
        Film film3 = new Film("114", "Gladiator", "Actiune", 300, false);
        Film film4 = new Film("134", "MadMax", "Actiune", 219, true);
        Film film5 = new Film("212", "TeamBuildind", "Comedie", 120, true);


        EpisodSerial episode1 = new EpisodSerial("362", "Agentul de noapte", "Actiune", 120, true, 1, 12);
        EpisodSerial episode2 = new EpisodSerial("222", "Queen", "Actiune", 100, false, 2, 4);

        Map<String, Film> listaNevazute = new HashMap<>();
        Map<String, Film> listaVazute = new HashMap<>();
        listaVazute.put(film1.getMovieId(), film1);
        listaVazute.put(film2.getMovieId(), film2);
        listaVazute.put(film3.getMovieId(), film3);
        listaNevazute.put(film4.getMovieId(), film4);
        listaNevazute.put(film5.getMovieId(), film5);

        Map<String, Film> listaNevazute1 = new HashMap<>();
        Map<String, Film> listaVazute1 = new HashMap<>();
        listaVazute1.put(film1.getMovieId(), film1);
        listaNevazute1.put(film2.getMovieId(), film2);
        listaNevazute1.put(film3.getMovieId(), film3);
        listaNevazute1.put(film4.getMovieId(), film4);
        listaNevazute1.put(film5.getMovieId(), film5);


        Abonament abonament1 = new Abonament(100, "STANDARD");
        Abonament abonament2 = new Abonament(101, "PREMIUM");

        Abonat abonat1 = new Abonat("121", "Ion", abonament1, listaNevazute, listaVazute);
        Abonat abonat2 = new Abonat("122", "George", abonament2, listaNevazute1, listaVazute1);


        try {
            streaming.addMovie(film1);
            streaming.addMovie(film2);
            streaming.addMovie(film3);
            streaming.addMovie(film4);
            streaming.addMovie(film5);
            streaming.addMovie(episode1);
            streaming.addMovie(episode2);
            streaming.addSubscriber(abonat1);
            streaming.addSubscriber(abonat2);

            abonat2.addToWishList(film4);
            abonat2.addToWishList(film5);
            abonat2.addToWishList(episode1);
            System.out.println("WishList pentru abonat2: " + abonat2.getWishList().values());
            System.out.println("WishList pentru abonat1: " + abonat1.getWishList().values());

            System.out.println("DejaVazuteAbonat2: " + abonat2.getAlreadyWatchedList().values());

            System.out.println();
            System.out.println("Abonament abonat1: " + abonat1.getAbonament().getTipAbonament());
            abonat1.setAbonament(abonament2);
            System.out.println("Abonament abonat1: " + abonat1.getAbonament().getTipAbonament());

            System.out.println("Comedii Valbile " + streaming.countComedyMovies());
            System.out.println();

            abonat1.watchMovie(film3);

        } catch (FilmIndisponibilException | PremiumNotEnabledException e) {
            e.printStackTrace();
        }
    }

}



