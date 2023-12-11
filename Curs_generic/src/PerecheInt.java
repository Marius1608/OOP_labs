public class PerecheInt {
    Integer first;
    Integer second;

    public Integer getFirst() {
        return first;
    }

    public Integer getSecond() {
        return second;
    }

    public PerecheInt(Integer first, Integer second) {
        this.first = first;
        this.second = second;
    }

    @Override
    public String toString() {
        return "PerecheInt " + "first=" + first + ", second=" + second;
    }


}
