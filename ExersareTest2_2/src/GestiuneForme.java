import java.util.ArrayList;

public class GestiuneForme {
    private ArrayList<FormaGeometrica> forme=new ArrayList<>();
    public void adaugaForma(FormaGeometrica forma) {
        forme.add(forma);
    }

    public void stergeForma(FormaGeometrica forma) {
        forme.remove(forma);
    }

    public void afiseazaDetaliiForme() {
        for (FormaGeometrica forma : forme) {
            System.out.println("Arie: " + forma.calculeazaAria() + ", Perimetru: " + forma.calculeazaPerimetru());
        }
    }

    public double calculeazaSumaArii() {
        double sumaArii = 0;
        for (FormaGeometrica forma : forme) {
            sumaArii += forma.calculeazaAria();
        }
        return sumaArii;
    }

    public double calculeazaSumaPerimetre() {
        double sumaPerimetre = 0;
        for (FormaGeometrica forma : forme) {
            sumaPerimetre += forma.calculeazaPerimetru();
        }
        return sumaPerimetre;
    }
}
