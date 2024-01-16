public class Mamifer extends Animal{
    public Mamifer(String nume, int greutate, int varsta, int popularitateProcent, boolean sanatate) {
        super(nume, greutate, varsta, popularitateProcent, sanatate);
    }

    @Override
    public String sunet() {
        return "Mehhh";
    }
}
