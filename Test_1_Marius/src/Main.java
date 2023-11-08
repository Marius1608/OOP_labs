
public class Main {
    public static void main(String[] args) {

    Biblioteca b1=new Biblioteca();

    Autor a1=new Autor("Preda","Marin",60);
    Carte c1=new Carte("Morometii",a1,122,3);


    Autor a2=new Autor("Sorescu","Marin",70);
    Carte c2=new Carte("Cantarea Noptii",a2,112,1);

    Autor a3=new Autor("Oprisan","Catalin",47);
    Carte c3=new Carte("Istoria stelei",a3,1243,4);

    Autor a4=new Autor("Calinescu","George",90);
    Carte c4=new Carte("Enigma Otiliei",a4,12,8);

    Autor a5=new Autor("Rebreanu","Liviu",80);
    Carte c5=new Carte("Ion",a5,2,33);

    b1.adaugaCarte(c1);
    b1.adaugaCarte(c2);
    b1.adaugaCarte(c3);
    b1.adaugaCarte(c4);
    b1.adaugaCarte(c5);
    System.out.println();

    b1.listeaza();
    System.out.println();

    int ok=b1.gasesteCarteDupaTitlu("Ion");
    if(ok==1)System.out.println("Cartea a fost gasita");
        else System.out.println("Cartea nu a fost gasita");

    int ok1=b1.gasesteCarteDupaTitlu("Infern");
    if(ok1==1)System.out.println("Cartea a fost gasita");
        else System.out.println("Cartea nu a fost gasita");

    }
}