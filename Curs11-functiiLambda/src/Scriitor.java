public class Scriitor extends Persoana {
    private int numarCarti;

    @Override
    public String toString() {
        return "Scriitor{ " + super.toString() +
                " numarCarti=" + numarCarti +
                '}';
    }

    public Scriitor(String nume, int varsta, int numarCarti) {
        super(nume, varsta);
        this.numarCarti = numarCarti;
    }

    public int getNumarCarti() {
        return numarCarti;
    }

    public void setNumarCarti(int numarCarti) {
        this.numarCarti = numarCarti;
    }
}
