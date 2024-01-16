public class ClientBiblioteca {
    private String nume;
    private int iD;
    private int varsta;

    public String getNume() {
        return nume;
    }

    public int getiD() {
        return iD;
    }

    public int getVarsta() {
        return varsta;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public void setiD(int iD) {
        this.iD = iD;
    }

    public void setVarsta(int varsta) {
        this.varsta = varsta;
    }

    public ClientBiblioteca(String nume, int iD, int varsta) {
        this.nume = nume;
        this.iD = iD;
        this.varsta = varsta;
    }

    public void imprumut(Carte carte) {
        try {
            if (carte.getGradUzura() > 8) {
                throw new ExceptieCarteDeteriorata("Cartea este deteriorata!");
            } else {
                System.out.println("Detalii client: " + detaliiClient());
                System.out.println("Detalii carte imprumutata: " + carte.detaliiCarte());
                carte.setPopularitate(carte.getPopularitate()+1);
                System.out.println("Popularitatea cartii a fost incrementata cu 1.");
            }
        } catch (ExceptieCarteDeteriorata e) {
            System.out.println("Exceptie: " + e.getMessage());
        }
    }

    public String detaliiClient() {
        return "Client: " + nume + " (ID: " + iD + ", Varsta: " + varsta + ")";
    }
}

