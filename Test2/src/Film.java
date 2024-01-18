public class Film {
    private String movieId;
    private String titlu;
    private String gen;
    private int durata;
    private boolean esteDisponibil;

    public String getMovieId() {
        return movieId;
    }

    public String getTitlu() {
        return titlu;
    }

    public String getGen() {
        return gen;
    }

    public int getDurata() {
        return durata;
    }

    public boolean isEsteDisponibil() {
        return esteDisponibil;
    }

    public void setMovieId(String movieId) {
        this.movieId = movieId;
    }

    public void setTitlu(String titlu) {
        this.titlu = titlu;
    }

    public void setGen(String gen) {
        this.gen = gen;
    }

    public void setDurata(int durata) {
        this.durata = durata;
    }

    public void setEsteDisponibil(boolean esteDisponibil) {
        this.esteDisponibil = esteDisponibil;
    }

    public Film(String movieId, String titlu, String gen, int durata, boolean esteDisponibil) {
        this.movieId = movieId;
        this.titlu = titlu;
        this.gen = gen;
        this.durata = durata;
        this.esteDisponibil = esteDisponibil;
    }

    @Override
    public String toString() {
        return "Film{" +
                "movieId=" + movieId +
                ", titlu='" + titlu + '\'' +
                ", gen='" + gen + '\'' +
                ", durata=" + durata +
                ", esteDisponibil=" + esteDisponibil +
                '}';
    }

}
