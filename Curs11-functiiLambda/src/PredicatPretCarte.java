import java.util.function.Predicate;

public class PredicatPretCarte implements Predicate<Carte> {
    private int pretMaxim;
    public PredicatPretCarte(int pretMaxim) {
        this.pretMaxim = pretMaxim;
    }
   @Override
   public boolean test(Carte c) {
         return c.getPret() < pretMaxim;
         }
}
