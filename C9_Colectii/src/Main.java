import java.util.*;

public class Main {
    public static void main(String[] args) {

        ArrayList<Carte> listaCarti = new ArrayList<>();
        Persoana a1=new Persoana("J.K. Rowling",30);
        Persoana a2=new Persoana("Rick Riordan",18);
        Persoana a3=new Persoana("J. R. R. Tolkien",43);
        Carte l1=new Carte(a1, "Harry Potter și piatra filozofală", 1997, "Egmont");
        Carte l2=new Carte(a1, "Harry Potter și Camera Secretelor", 1997, "Egmont");
        Carte l3=new Carte(a1, "Harry Potter și Prizonierul din Azkaban", 1999, "Egmont");
        Carte l4=new Carte(a1, "Harry Potter și Pocalul de Foc", 2000, "Egmont");

        Carte l5=new Carte(a2, "Percy Jackson și Olimpienii (#1). Hoțul fulgerului", 2022, "Arthur");
        Carte l6=new Carte(a2, "Percy Jackson și Olimpienii (#4). Bătălia din Labirint", 2023, "Arthur");

        Carte l7=new Carte(a3, "The Fellowship of the Ring", 1954, "RAO");
        Carte l8=new Carte(a3, "The Two Towers", 1954, "RAO");
        Carte l9=new Carte(a3, "The Return of the King", 1955, "RAO");


        listaCarti.add(l1);
        listaCarti.add(l2);
        listaCarti.add(l3);
        listaCarti.add(l4);
        listaCarti.add(l5);
        listaCarti.add(l6);
        listaCarti.add(l7);
        listaCarti.add(l8);
        listaCarti.add(l9);

        LinkedList<Carte> listaCarti2=new LinkedList<>();
        listaCarti2.add(l1);
        listaCarti2.add(l1);
        listaCarti2.add(l2);
        listaCarti2.add(l3);
        listaCarti2.add(l4);


        ///Nu tin ordinea,nu tine duplicate
        HashSet<Carte> listaCarti3=new HashSet<>();
        listaCarti3.add(l1);
        listaCarti3.add(l1);
        listaCarti3.add(l2);
        listaCarti3.add(l5);
        listaCarti3.add(l3);
        listaCarti3.add(l4);
        listaCarti3.add(l5);

        //Nu tine duplicate,pastreaza ordinea
        LinkedHashSet<Carte> listaCarti4=new LinkedHashSet<>();
        listaCarti4.add(l1);
        listaCarti4.add(l1);
        listaCarti4.add(l2);
        listaCarti4.add(l3);
        listaCarti4.add(l4);
        listaCarti4.add(l5);


        //nu ne lasa sa avem duplicate ,se bazeaza pe compartor
        TreeSet<Carte> listaCarti5=new TreeSet<>();
        listaCarti5.add(l1);
        listaCarti5.add(l2);
        listaCarti5.add(l3);
        listaCarti5.add(l4);
        listaCarti5.add(l5);
        listaCarti5.add(l6);
        listaCarti5.add(l7);
        listaCarti5.add(l8);
        listaCarti5.add(l9);




        System.out.println("Lista de cărți:");
        for (Carte carte : listaCarti) {
            System.out.println(carte);
        }

        System.out.println();
        Collections.sort(listaCarti);
        System.out.println("Lista de cărți sortate :");
        for (Carte carte : listaCarti) {
            System.out.println(carte);
        }

        System.out.println("Lista de cărți cu linked list:");
        for (Carte carte : listaCarti2) {
            System.out.println(carte);
        }
        System.out.println();

        System.out.println("Lista de cărți cu Hash Set:");
        for (Carte carte : listaCarti3) {
            System.out.println(carte);
        }
        System.out.println();

        System.out.println("Lista de cărți cu Linked Hash Set:");
        for (Carte carte : listaCarti4) {
            System.out.println(carte);
        }
        System.out.println();

        System.out.println("Lista de cărți cu Tree Set:");
        for (Carte carte : listaCarti5) {
            System.out.println(carte);
        }
        System.out.println();

    }
}