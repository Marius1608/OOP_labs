public class Carte {

    public Carte(){}
    public Carte(String titlu, Scriitor autor, int nrPagini,
                 double pret, TipCarte tip) {
        this.titlu = titlu;
        this.autor = autor;
        this.nrPagini = nrPagini;
        this.pret = pret;
        this.tip = tip;
    }

    @Override
    public String toString() {
        return "Carte{" +
                "titlu='" + titlu + '\'' +
                ", autor='" + autor + '\'' +
                ", nrPagini=" + nrPagini +
                ", pret=" + pret +
                ", tip=" + tip +
                '}';
    }

    public String getTitlu() {
        return titlu;
    }

    public void setTitlu(String titlu) {
        this.titlu = titlu;
    }

    public Scriitor getAutor() {
        return autor;
    }

    public void setAutor(Scriitor autor) {
        this.autor = autor;
    }

    public int getNrPagini() {
        return nrPagini;
    }

    public void setNrPagini(int nrPagini) {
        this.nrPagini = nrPagini;
    }

    public double getPret() {
        return pret;
    }

    public void setPret(double pret) {
        this.pret = pret;
    }

    public TipCarte getTip() {
        return tip;
    }

    public void setTip(TipCarte tip) {
        this.tip = tip;
    }

    private Scriitor autor;
    private String titlu;
    private int nrPagini;
    private double pret;
    private TipCarte tip;
}
