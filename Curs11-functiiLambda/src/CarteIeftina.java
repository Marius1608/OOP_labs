import java.util.function.Predicate;
public class CarteIeftina implements Predicate<Carte> {
 @Override
 public boolean test(Carte carte) {
         return carte.getPret() < 30;
         }
 }
