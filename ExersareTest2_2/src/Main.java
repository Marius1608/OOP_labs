
public class Main {
    public static void main(String[] args) {

        Dreptunghi dreptunghi = new Dreptunghi(5, 10);
        Cerc cerc = new Cerc(3);
        Triunghi triunghi = new Triunghi(3, 4, 5);

        GestiuneForme gestiuneForme = new GestiuneForme();
        gestiuneForme.adaugaForma(dreptunghi);
        gestiuneForme.adaugaForma(cerc);
        gestiuneForme.adaugaForma(triunghi);

        gestiuneForme.afiseazaDetaliiForme();

        System.out.println("Suma totala a ariilor: " + gestiuneForme.calculeazaSumaArii());
        System.out.println("Suma totala a perimetrelor: " + gestiuneForme.calculeazaSumaPerimetre());
    }
}