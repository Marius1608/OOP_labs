public abstract class Carte {

    private String titlu;
    private String autor;
    private int nrPagini;
    private int popularitate;
    private int gradUzura;

    public abstract String detaliiCarte();

    public String getTitlu() {
        return titlu;
    }

    public String getAutor() {
        return autor;
    }

    public int getNrPagini() {
        return nrPagini;
    }

    public int getPopularitate() {
        return popularitate;
    }

    public int getGradUzura() {
        return gradUzura;
    }

    public void setTitlu(String titlu) {
        this.titlu = titlu;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public void setNrPagini(int nrPagini) {
        this.nrPagini = nrPagini;
    }

    public void setPopularitate(int popularitate) {
        this.popularitate = popularitate;
    }

    public void setGradUzura(int gradUzura) {
        this.gradUzura = gradUzura;
    }

    public Carte(String titlu, String autor, int nrPagini, int popularitate, int gradUzura) {
        this.titlu = titlu;
        this.autor = autor;
        this.nrPagini = nrPagini;
        this.popularitate = popularitate;
        this.gradUzura = gradUzura;
    }

    @Override
    public String toString() {
        return "Carte{" +
                "titlu='" + titlu + '\'' +
                ", autor='" + autor + '\'' +
                ", nrPagini=" + nrPagini +
                ", popularitate=" + popularitate +
                ", gradUzura=" + gradUzura +
                '}';
    }

}
