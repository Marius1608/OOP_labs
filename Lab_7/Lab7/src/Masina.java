public class Masina implements Cloneable{
    private String marca;
    private String culoare;

    public Masina(String marca, String culoare) {
        this.marca = marca;
        this.culoare = culoare;
    }

    public void revopsire(String culoareNoua) {
        this.culoare = culoareNoua;
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    public String toString() {
        return "Masina: " + marca + ", Culoare: " + culoare;
    }
}
