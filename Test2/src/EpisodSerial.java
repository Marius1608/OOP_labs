public class EpisodSerial extends Film{
    private int numarSezon;
    private int numarEpisod;

    public int getNumarSezon() {
        return numarSezon;
    }

    public int getNumarEpisod() {
        return numarEpisod;
    }

    public void setNumarSezon(int numarSezon) {
        this.numarSezon = numarSezon;
    }

    public void setNumarEpisod(int numarEpisod) {
        this.numarEpisod = numarEpisod;
    }

    public EpisodSerial(String movieId, String titlu, String gen, int durata, boolean esteDisponibil, int numarSezon, int numarEpisod) {
        super(movieId, titlu, gen, durata, esteDisponibil);
        this.numarSezon = numarSezon;
        this.numarEpisod = numarEpisod;
    }
}
