public class Rezervor {
    private int capcitateMaxima;
    private float nivelCurentUmplere;

    public float getNivelCurentUmplere() {
        return nivelCurentUmplere;
    }

    public void setNivelCurentUmplere(float nivelCurentUmplere) {
        this.nivelCurentUmplere = nivelCurentUmplere;
    }

    void umplere(int nr) {
        if (this.nivelCurentUmplere <= capcitateMaxima) nivelCurentUmplere += nr;

    }

    void golire(int nr) {
        if(nivelCurentUmplere==capcitateMaxima)nivelCurentUmplere=nivelCurentUmplere-nr;
    }

    void golire(){
        if(nivelCurentUmplere<capcitateMaxima) nivelCurentUmplere=nivelCurentUmplere-10;
    }

    public Rezervor(int c, int n)
    {
        this.capcitateMaxima=c;
        this.nivelCurentUmplere=n;
    }
    @Override
    public String toString() {
        return "Rezervor{" +
                "capcitateMaxima=" + capcitateMaxima +
                ", nivelCurentUmplere=" + nivelCurentUmplere +
                '}';
    }
}
