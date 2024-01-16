
public class Main {
    public static void main(String[] args) {

        Biblioteca biblioteca = new Biblioteca();

        Carte fictiune1 = new Fictiune("Fictiune1", "Autor1", 250, 5, 7);
        Carte istorie1 = new Istorie("Istorie1", "Autor2", 400, 8, 9);
        Carte filozofie1 = new Filozofie("Filozofie1", "Autor3", 150, 7, 5);

        biblioteca.adaugaCarte(fictiune1);
        biblioteca.adaugaCarte(istorie1);
        biblioteca.adaugaCarte(filozofie1);


        biblioteca.stergeCarte(filozofie1);
        biblioteca.afiseazaCarti();


        for (Carte carte : biblioteca.getBiblioteca1()) {
            System.out.println("\nDetalii pentru carte: " + carte.getTitlu());
            System.out.println(carte.detaliiCarte());

            try {
                biblioteca.verificareNumarPagini(carte.getTitlu(), carte.getNrPagini());
            } catch (ExceptieNumarPagini e) {
                System.out.println("Exceptie: " + e.getMessage());
            }
        }


        ClientBiblioteca client = new ClientBiblioteca("ion",121,23);

        client.imprumut(fictiune1);
        client.imprumut(istorie1);
    }
}