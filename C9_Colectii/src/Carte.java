public class Carte implements Comparable<Carte>{

    private Persoana autor;
    private String titlu;
    private int anAparitie;
    private String editura;

    public Persoana getAutor() {
        return autor;
    }

    public int getAnAparitie() {
        return anAparitie;
    }

    public String getEditura() {
        return editura;
    }

    public String getTitlu() {
        return titlu;
    }

    public void setAutor(Persoana autor) {
        this.autor = autor;
    }

    public void setAnAparitie(int anAparitie) {
        this.anAparitie = anAparitie;
    }

    public void setEditura(String editura) {
        this.editura = editura;
    }

    public void setTitlu(String titlu) {
        this.titlu = titlu;
    }

    public Carte(Persoana autor, String titlu, int anAparitie, String editura) {
        this.autor = autor;
        this.titlu = titlu;
        this.anAparitie = anAparitie;
        this.editura = editura;
    }

    /*
    //Dupa editura
    public int compareTo(Carte a){
        return this.getEditura().compareTo(a.getEditura());
    }
    */

    //Comparare cu anAparitiei
    @Override
    public int compareTo(Carte o) {
        if(this.getAnAparitie()<o.getAnAparitie())return -1;
        else if (this.getAnAparitie()>o.getAnAparitie()) return +1;
        return 0;
    }

    @Override
    public String toString() {
        return "Carte{" +
                "autor=" + autor +
                ", anAparitie=" + anAparitie +
                ", editura='" + editura + '\'' +
                ", titlu='" + titlu + '\'' +
                '}';
    }
}
