public class Sofer {
    private String nume;
    private String prenume;
    private int varsta;
    private int nrPermisConducere;

    public String getNume() {
        return nume;
    }

    public String getPrenume() {
        return prenume;
    }

    public int getVarsta() {
        return varsta;
    }

    public int getNrPermisConducere() {
        return nrPermisConducere;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public void setPrenume(String prenume) {
        this.prenume = prenume;
    }

    public void setVarsta(int varsta) {
        this.varsta = varsta;
    }

    public void setNrPermisConducere(int nrPermisConducere) {
        this.nrPermisConducere = nrPermisConducere;
    }

    public Sofer(String n,String p,int v ,int nr) {
        this.nrPermisConducere=nr;
        this.nume=n;
        this.prenume=p;
        this.varsta=v;
    }

    @Override
    public String toString() {
        return "Sofer{" +
                "nume='" + nume + '\'' +
                ", prenume='" + prenume + '\'' +
                ", varsta=" + varsta +
                ", nrPermisConducere=" + nrPermisConducere +
                '}';
    }
}
