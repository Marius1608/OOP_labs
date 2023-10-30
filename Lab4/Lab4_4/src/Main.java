import java.util.List;

public class Main {
    public static void main(String[] args) {

        Biblioteca biblioteca = new Biblioteca(0, "Biblioteca C.Cluj", "Cluj Napoca");

        Carte carte1 = new Carte("Liviu Rebreanu", "Ion", 1920, 0, "disponibila");
        Carte carte2 = new Carte("George Calinescu", "Enigma Otiliei", 1930, 0, "disponibila");
        Carte carte3 = new Carte("Ion Ionascu", "Dezideratii", 2000, 2023, "indisponibila");

        biblioteca.adaugaCarte(carte1);
        biblioteca.adaugaCarte(carte2);
        biblioteca.adaugaCarte(carte3);


        System.out.println("Cartile din " + biblioteca.getNumeBiblioteca() + ":");
        System.out.println();

        List<Carte> carti = biblioteca.getCarti();
        for (Carte carte : carti) {
            System.out.println(carte);
        }
        System.out.println();


        String titluCautat = "La Medeleni";
        Carte carteGasita = biblioteca.gasesteCarteDupaTitlu(titluCautat);
        if (carteGasita != null) {
            System.out.println("Am găsit cartea cu titlul " + titluCautat + ":");
            System.out.println(carteGasita);
        } else {
            System.out.println("Cartea cu titlul " + titluCautat + " nu a fost găsită.");
        }
        System.out.println();

        if (carte2.esteDisponibila()) {
            carte2.inchiriazaCarte();
            System.out.println("Cartea a fost închiriată.");
        } else {
            System.out.println("Cartea nu este disponibilă pentru închiriere.");
        }
        System.out.println();

        System.out.println("Informații actualizate :");
        for (Carte carte : carti) {
            System.out.println(carte.toString());
        }
        System.out.println();

        carte2.returneazaCarte();
        System.out.println("Cartea a fost returnată.");
        System.out.println();


        System.out.println("Informații actualizate :");
        for (Carte carte : carti) {
            System.out.println(carte.toString());
        }
    }
}