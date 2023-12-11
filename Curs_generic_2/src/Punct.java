public class Punct<T extends Number> {
    public T x;
    public T y;

    public T getX() {
        return x;
    }

    public T getY() {
        return y;
    }

    public Punct(T x, T y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public String toString() {
        return "Punct{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }
    public <T extends Number>double distanta(Punct<T> p){
        return Math.sqrt(Math.pow(x.doubleValue()-p.getX().doubleValue(),2)+Math.pow(y.doubleValue()-p.getY().doubleValue(),2));
    }

}
