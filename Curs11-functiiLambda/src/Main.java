import java.util.List;
import java.util.function.Predicate;
import java.util.List;

public class Main {
    private static void afiseazaCartiBIOGRAFICE(List<Carte> carti){
            for (Carte c:carti)
             if (c.getTip() == TipCarte.BIOGRAFIE)
                 System.out.println(c);
         }

    private static void afiseazaCartiFictiune(List<Carte> carti){
        for (Carte c:carti)
            if (c.getTip() == TipCarte.FICTIUNE)
                System.out.println(c);
    }

    private static void afiseazaCartiMaiMic30(List<Carte> carti){
        for (Carte c:carti)
            if (c.getPret()<30.0)
                System.out.println(c);
    }

    private static void afiseazaCarti(Iterable<Carte> carti, Predicate<Carte> pr) {
         for (Carte c : carti) {
             if (pr.test(c)) System.out.println(c);
             }
    }



    public static void main(String[] args) {
        List<Carte> carti = CatalogCarti.initializeazaCatalog();
        for (Carte c:carti)
            System.out.println(c);
        System.out.println();

        afiseazaCartiBIOGRAFICE(carti);
        System.out.println();

        afiseazaCartiFictiune(carti);
        System.out.println();

        afiseazaCartiMaiMic30(carti);
        System.out.println();

        List<Carte> carti2 = CatalogCarti.initializeazaCatalog();
        System.out.println("Carti ieftine:");
        afiseazaCarti(carti2, new CarteIeftina());
        System.out.println();

        System.out.println("Carti biografice:");
        afiseazaCarti(carti2, new CarteBiografica());
        System.out.println();

        List<Carte> carti3 = CatalogCarti.initializeazaCatalog();
        System.out.println("Carti biografice:");
        afiseazaCarti(carti3, new Predicate<Carte>() {
            @Override
            public boolean test(Carte carte) {
                return carte.getTip()==TipCarte.BIOGRAFIE;
            }
        });
        System.out.println();

        List<Carte> carti4 = CatalogCarti.initializeazaCatalog();
        afiseazaCarti(carti4, new PredicatPretCarte(50){
            int numarPagini;
            {
                 numarPagini = 400;
                 System.out.println("Init numarPagini: " + numarPagini);
            }
            @Override
            public boolean test(Carte c) {
                return super.test(c) && c.getNrPagini() > numarPagini;
            } }
        );

        System.out.println();
        List<Carte> carti5 = CatalogCarti.initializeazaCatalog();

        afiseazaCarti(carti5, (c)->{return c.getPret() < 40 && c.getNrPagini() > 400;});
        System.out.println();

        afiseazaCarti(carti5, (c)->{return c.getTip()==TipCarte.BIOGRAFIE;});
        System.out.println();
    }
}