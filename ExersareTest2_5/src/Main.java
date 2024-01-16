
public class Main {
    public static void main(String[] args) throws ExceptieAnimalNesanatos,ExceptieGreutate {

    Zoo z1=new Zoo();
    Animal a1=new Reptila("Sarpe",1,2,30,true);
    Animal a2=new Mamifer("Leu",80,6,70,true);
    Animal a3=new Pasare("Flamingo",20,8,60,false);
    Animal a4=new Mamifer("Gorila",320,12,30,true);

    z1.adaugareAnimal(a1);
    z1.adaugareAnimal(a2);
    z1.adaugareAnimal(a3);
    z1.adaugareAnimal(a4);

    z1.afisareAnimale();
    System.out.println();

    z1.stergereAnimal(a2);
    z1.afisareAnimale();
    System.out.println();

    z1.adaugareAnimal(a2);

    for (Animal animal : z1.getZoo1()) {
        System.out.println("\nDetalii pentru animal: " + animal.getNume());
        System.out.println("Sunet: " + animal.sunet());
        try {
            z1.verificareGreutate(animal.getNume(), animal.getGreutate());
        } catch (ExceptieGreutate e) {
            System.out.println("Exceptie: " + e.getMessage());
        }
    }


    Vizitator V1=new Vizitator("Ion",13122,23);
    V1.vizita(a3);

    }
}