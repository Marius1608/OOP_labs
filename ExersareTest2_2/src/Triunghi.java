public class Triunghi implements FormaGeometrica{
    private double l1;
    private double l2;
    private double l3;

    public double getL1() {
        return l1;
    }

    public double getL2() {
        return l2;
    }

    public double getL3() {
        return l3;
    }

    public Triunghi(double l1, double l2, double l3) {
        this.l1 = l1;
        this.l2 = l2;
        this.l3 = l3;
    }

    public Triunghi(){
        this.l1=0;
        this.l2=0;
        this.l3=0;
    }

    @Override
    public double calculeazaAria() {

        double semiPerimetru = calculeazaPerimetru() / 2;
        return Math.sqrt(semiPerimetru * (semiPerimetru - l1) * (semiPerimetru - l2) * (semiPerimetru - l3));
    }

    @Override
    public double calculeazaPerimetru() {
        return l1 + l2 + l3;
    }


}

