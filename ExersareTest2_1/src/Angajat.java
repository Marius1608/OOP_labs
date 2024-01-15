public class Angajat {
    private String nume;
    private double salariu;

    public String getNume() {
        return nume;
    }

    public double getSalariu() {
        return salariu;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public void setSalariu(double salariu) {
        this.salariu = salariu;
    }

    public Angajat(String nume,double salariu){
        this.salariu=salariu;
        this.nume=nume;
    }

    public Angajat(){
        this.nume="";
        this.salariu=0;

    }

    public void afiseazaDetalii(){
        System.out.println(getNume());
        System.out.println(getSalariu());
    }

    @Override
    public String toString() {
        return "Angajat{" +
                "nume='" + nume + '\'' +
                ", salariu=" + salariu +
                '}';
    }

}
