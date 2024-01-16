import java.util.ArrayList;

public class Zoo implements ZooManagement{
    ArrayList<Animal> zoo1=new ArrayList<>();

    public ArrayList<Animal> getZoo1() {
        return zoo1;
    }

    @Override
    public void adaugareAnimal(Animal animal) {
        zoo1.add(animal);
    }

    @Override
    public void stergereAnimal(Animal animal) {
        zoo1.remove(animal);

    }

    @Override
    public void afisareAnimale() {

        for(Animal anm:zoo1){
            System.out.println(anm);
        }
    }

    public void verificareGreutate(String numeAnimal, double greutateAnimal) throws ExceptieGreutate {
        for (Animal animal : zoo1) {
            if (animal.getNume().equals(numeAnimal) && animal.getGreutate() > 300) {
                throw new ExceptieGreutate("Animalul '" + numeAnimal + "' depaseste 300 de kg cu "
                        + (animal.getGreutate() - 300) + " kg.");
            }
        }
    }
}
