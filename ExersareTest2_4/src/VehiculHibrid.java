public class VehiculHibrid extends VehiculBaza{

    private double autonomieElectric;
    private double autonomieCombustibil;

    public VehiculHibrid(String marca, int anulFabricatiei, double pret, double autonomieElectric, double autonomieCombustibil) {
        super(marca, anulFabricatiei, pret);
        this.autonomieElectric = autonomieElectric;
        this.autonomieCombustibil = autonomieCombustibil;
    }

    public double obtineAutonomieElectric() {
        return autonomieElectric;
    }

    public double obtineAutonomieCombustibil() {
        return autonomieCombustibil;
    }

    @Override
    public void afiseazaDetalii() {
        super.afiseazaDetalii();
        System.out.println("Autonomie electrica: " + autonomieElectric + " km, Autonomie combustibil: " + autonomieCombustibil + " km");
    }
}
