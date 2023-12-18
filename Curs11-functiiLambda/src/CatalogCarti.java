import java.util.ArrayList;
import java.util.List;

public class CatalogCarti {
    public static List<Carte> initializeazaCatalog(){
        List<Carte> lista = new ArrayList<>();
        lista.add(new Carte("Codul Fotografiei", new Scriitor("Vlad Eftenie", 50, 7),
                126, 56.25, TipCarte.ARTA));
        lista.add(new Carte("Albastru. Istoria unei culori fascinante", new Scriitor("Pastoureau Michel", 55, 20),
                192, 14.0, TipCarte.ARTA));
        lista.add(new Carte("Povestea mea", new Scriitor("Michelle Obama", 58, 5),
                624, 39.95, TipCarte.BIOGRAFIE));
        lista.add(new Carte("Viata este o poveste", new Scriitor("Florin Piersic", 85, 30),
                376, 29.5, TipCarte.BIOGRAFIE));
        lista.add(new Carte("Cat timp infloresc lamaii", new Scriitor("Zoulfa Katouh", 67, 24),
                432, 29.5, TipCarte.FICTIUNE));
        lista.add(new Carte("Atomic Habbits", new Scriitor("James Clear", 45, 10),
                271, 32.5, TipCarte.DEZVOLTARE_PERSONALA));
        lista.add(new Carte("Revolutia Glucozei", new Scriitor("Jessie Inchauspe", 46, 12),
                360, 32.5, TipCarte.DEZVOLTARE_PERSONALA));

        return lista;
    }
}
