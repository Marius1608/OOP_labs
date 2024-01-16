public class Vizitator {
    private String nume;
    private int Id;
    private int varsta;

    public String getNume() {
        return nume;
    }

    public int getId() {
        return Id;
    }

    public int getVarsta() {
        return varsta;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public void setId(int id) {
        Id = id;
    }

    public void setVarsta(int varsta) {
        this.varsta = varsta;
    }

    public Vizitator(String nume, int id, int varsta) {
        this.nume = nume;
        Id = id;
        this.varsta = varsta;
    }

    public void vizita(Animal animal) {
        try {
            System.out.println("Detalii vizitator: " + detaliiVizitator());
            System.out.println("Detalii animal vizitat: " + animal.getNume() + ", Sunet: " + animal.sunet());
            animal.setPopularitateProcent(animal.getPopularitateProcent()+1);

            if (animal.isSanatate()==false) {
                throw new ExceptieAnimalNesanatos("Animalul este nesanatos!");
            }
        } catch (ExceptieAnimalNesanatos e) {
            System.out.println("Exceptie: " + e.getMessage());
        }
    }

    public String detaliiVizitator() {
        return "Vizitator: " + nume + " (ID: " + Id + ", Varsta: " + varsta + ")";
    }
}
