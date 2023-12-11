public class PerecheString {

    String first;
    String second;

    public PerecheString(String first, String second) {
        this.first = first;
        this.second = second;
    }

    public String getFirst() {
        return first;
    }

    public String getSecond() {
        return second;
    }

    @Override
    public String toString() {
        return "PerecheString " + "first=" + first  + ", second=" + second ;
    }
}
