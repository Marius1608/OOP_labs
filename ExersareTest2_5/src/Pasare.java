public class Pasare extends Animal{

    public Pasare(String nume, int greutate, int varsta, int popularitateProcent, boolean sanatate) {
        super(nume, greutate, varsta, popularitateProcent, sanatate);
    }

    @Override
    public String sunet() {
        return "Cra Cra";
    }
}
