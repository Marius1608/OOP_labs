import java.util.Arrays;

public class Biblioteca {

    Carte[] carti=new Carte[5];
    int numarCarti=0;
    public void adaugaCarte(Carte carte) {
        if (!carteExista(carte.getiD()) && carte.getCopiiDisponibile() > 0) {
            carti[numarCarti] = carte;
            numarCarti++;
            System.out.println("Carte adaugata cu succes: " + carte.getTitlu());
        } else {
            System.out.println("Nu se poate adauga carte.");
        }
    }

    private boolean carteExista(int id) {
        for (int i = 0; i < numarCarti; i++) {
            if (carti[i] != null && carti[i].getiD() == id) {
                return true;
            }
        }
        return false;
    }

    public int gasesteCarteDupaTitlu(String titlu) {
        int ok = 0;
        for (Carte carte : carti) {
            if (carte.getTitlu().equalsIgnoreCase(titlu)) {
                ok = 1;
            }
        }
        return ok;
    }

   public void listeaza(){
        for(Carte i:carti){
            System.out.println(i);
        }
   }


}
