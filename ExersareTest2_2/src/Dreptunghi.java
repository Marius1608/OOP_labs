public class Dreptunghi implements FormaGeometrica{
    private double lungime;
    private double latime;

    public double getLungime() {
        return lungime;
    }

    public double getLatime() {
        return latime;
    }

    public Dreptunghi(double lungime, double latime){
        this.lungime=lungime;
        this.latime=latime;
    }

    public Dreptunghi(){
        this.lungime=0;
        this.latime=0;
    }


    @Override
    public double calculeazaAria() {
        return lungime*latime;
    }

    @Override
    public double calculeazaPerimetru() {
        return 2*latime+2*lungime;
    }

    @Override
    public String toString() {
        return "Dreptunghi{" +
                "lungime=" + lungime +
                ", latime=" + latime +
                '}';
    }
}
