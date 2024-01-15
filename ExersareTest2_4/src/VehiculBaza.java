public class VehiculBaza implements Vehicul{
    private String marca;
    private int anulFabricatiei;
    private double pret;

    public String getMarca() {
        return marca;
    }

    public int getAnulFabricatiei() {
        return anulFabricatiei;
    }

    public double tPret() {
        return pret;
    }

    public VehiculBaza(String marca, int anulFabricatiei, double pret) {
        this.marca = marca;
        this.anulFabricatiei = anulFabricatiei;
        this.pret = pret;
    }
    @Override
    public String obtineMarca() {
        return marca;
    }

    @Override
    public int obtineAnulFabricatiei() {
        return anulFabricatiei;
    }

    @Override
    public double obtinePretul() {
        return pret;
    }



    @Override
    public void afiseazaDetalii() {
        System.out.println("Marca: " + marca + ", Anul fabricatiei: " + anulFabricatiei + ", Pret: " + pret);
    }
}
