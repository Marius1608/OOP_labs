public class Cerc implements FormaGeometrica {
    private double razaCerc;

    public double getRazaCerc() {
        return razaCerc;
    }

    public Cerc(double razaCerc) {
        this.razaCerc = razaCerc;
    }

    public Cerc(){
        this.razaCerc=0;
    }

    @Override
    public double calculeazaPerimetru() {
        return 3.16*razaCerc*2;
    }

    @Override
    public double calculeazaAria() {
        return 3.16*razaCerc*razaCerc;
    }

    @Override
    public String toString() {
        return "Cerc{" +
                "razaCerc=" + razaCerc +
                '}';
    }
}