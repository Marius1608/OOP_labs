public class VehiculElectric extends  VehiculBaza{

    private double autonomie;

    public VehiculElectric(String marca, int anulFabricatiei, double pret, double autonomie) {
        super(marca, anulFabricatiei, pret);
        this.autonomie = autonomie;
    }

    public double obtineAutonomie() {
        return autonomie;
    }

    @Override
    public void afiseazaDetalii() {
        super.afiseazaDetalii();
        System.out.println("Autonomie electrica: " + autonomie + " km");
    }

}
