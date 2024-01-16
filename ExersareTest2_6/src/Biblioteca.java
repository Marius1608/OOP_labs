import java.util.ArrayList;

public class Biblioteca implements ManagementBiblioteca {
    ArrayList<Carte> biblioteca1=new ArrayList<>();

    @Override
    public void adaugaCarte(Carte carte) {
        biblioteca1.add(carte);
    }

    @Override
    public void stergeCarte(Carte carte) {
        biblioteca1.remove(carte);
    }

    @Override
    public void afiseazaCarti() {
        for(Carte e:biblioteca1){
            System.out.println(e);
            System.out.println();
        }
    }

    public void verificareNumarPagini(String numeCarte, int numarPagini) throws ExceptieNumarPagini {
        for (Carte carte : biblioteca1) {
            if (carte.getTitlu().equals(numeCarte) && carte.getNrPagini() > 300) {
                throw new ExceptieNumarPagini("Cartea '" + numeCarte + "' depaseste 300 de pagini cu "
                        + (carte.getNrPagini() - 300) + " pagini.");
            }
        }
    }

    public ArrayList<Carte> getBiblioteca1() {
        return biblioteca1;
    }

    public void setBiblioteca1(ArrayList<Carte> biblioteca1) {
        this.biblioteca1 = biblioteca1;
    }

}
