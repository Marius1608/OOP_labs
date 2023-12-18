import java.util.function.Predicate;
public class CarteBiografica implements Predicate<Carte> {
    @Override
    public boolean test(Carte carte) {
        return carte.getTip() == TipCarte.BIOGRAFIE;
    }
}
