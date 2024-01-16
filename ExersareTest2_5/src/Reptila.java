public class Reptila extends Animal{

    public Reptila(String nume, int greutate, int varsta, int popularitateProcent, boolean sanatate) {
        super(nume, greutate, varsta, popularitateProcent, sanatate);
    }

    @Override
    public String sunet() {
        return "Pst Pst";
    }
}
