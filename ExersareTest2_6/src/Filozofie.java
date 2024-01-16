public class Filozofie extends Carte{
    public Filozofie(String titlu, String autor, int nrPagini, int popularitate, int gradUzura) {
        super(titlu, autor, nrPagini, popularitate, gradUzura);
    }

    @Override
    public String detaliiCarte() {
        return "Filozofiez";
    }
}
