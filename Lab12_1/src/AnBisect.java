public class AnBisect {
    public boolean esteAnBisect(int an) {
        if ((an % 4 == 0 && an % 100 != 0) || (an % 400 == 0)) {
            return true;
        } else {
            return false;
        }
    }
}
