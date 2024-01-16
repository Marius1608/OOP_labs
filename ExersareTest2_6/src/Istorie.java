public class Istorie extends Carte{
    public Istorie(String titlu, String autor, int nrPagini, int popularitate, int gradUzura) {
        super(titlu, autor, nrPagini, popularitate, gradUzura);
    }

    @Override
    public String detaliiCarte() {
        return "Istorie";
    }
}
