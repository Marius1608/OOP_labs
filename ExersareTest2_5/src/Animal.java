public abstract class Animal {
    private String nume;
    private int greutate;
    private int varsta;
    private int popularitateProcent;
    private boolean sanatate;

    public abstract String sunet();

    public String getNume() {
        return nume;
    }

    public int getGreutate() {
        return greutate;
    }

    public int getVarsta() {
        return varsta;
    }

    public int getPopularitateProcent() {
        return popularitateProcent;
    }

    public boolean isSanatate() {
        return sanatate;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public void setGreutate(int greutate) {
        this.greutate = greutate;
    }

    public void setVarsta(int varsta) {
        this.varsta = varsta;
    }

    public void setPopularitateProcent(int popularitateProcent) {
        this.popularitateProcent = popularitateProcent;
    }

    public void setSanatate(boolean sanatate) {
        this.sanatate = sanatate;
    }

    public Animal(String nume, int greutate, int varsta, int popularitateProcent, boolean sanatate) {
        this.nume = nume;
        this.greutate = greutate;
        this.varsta = varsta;
        this.popularitateProcent = popularitateProcent;
        this.sanatate = sanatate;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "nume='" + nume + '\'' +
                ", greutate=" + greutate +
                ", varsta=" + varsta +
                ", popularitateProcent=" + popularitateProcent +
                ", sanatate=" + sanatate +
                '}';
    }
}
