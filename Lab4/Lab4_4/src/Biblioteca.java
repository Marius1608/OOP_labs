import java.util.ArrayList;
import java.util.List;

public class Biblioteca {
    private int nrCarti;
    private String numeBiblioteca;
    private String locatieBiblioteca;

    private List<Carte> carti = new ArrayList<>();

    public Biblioteca(int nrCarti, String numeBiblioteca, String locatieBiblioteca) {
        this.nrCarti = nrCarti;
        this.numeBiblioteca = numeBiblioteca;
        this.locatieBiblioteca = locatieBiblioteca;
    }

    public void adaugaCarte(Carte carte) {
        carti.add(carte);
        nrCarti++;
    }


    public void stergeCarte(Carte carte) {
        carti.remove(carte);
        nrCarti--;
    }


    public Carte gasesteCarteDupaTitlu(String titlu) {
        for (Carte carte : carti) {
            if (carte.getTitlu().equalsIgnoreCase(titlu)) {
                return carte;
            }
        }
        return null;
    }

    public int getNrCarti() {
        return nrCarti;
    }

    public String getNumeBiblioteca() {
        return numeBiblioteca;
    }

    public String getLocatieBiblioteca() {
        return locatieBiblioteca;
    }

    public List<Carte> getCarti() {
        return carti;
    }

    public void setNrCarti(int nrCarti) {
        this.nrCarti = nrCarti;
    }

    public void setNumeBiblioteca(String numeBiblioteca) {
        this.numeBiblioteca = numeBiblioteca;
    }

    public void setLocatieBiblioteca(String locatieBiblioteca) {
        this.locatieBiblioteca = locatieBiblioteca;
    }

    public void setCarti(List<Carte> carti) {
        this.carti = carti;
    }

    @Override
    public String toString() {
        return "Biblioteca{" +
                "nrCarti=" + nrCarti +
                ", numeBiblioteca='" + numeBiblioteca + '\'' +
                ", locatieBiblioteca='" + locatieBiblioteca + '\'' +
                ", carti=" + carti +
                '}';
    }
}
