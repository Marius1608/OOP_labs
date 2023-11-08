public class Autor {

    private String nume;
    private String prenume;
    private int varsta;

    public String getNume() {
        return nume;
    }

    public String getPrenume() {
        return prenume;
    }

    public int getVarsta() {
        return varsta;
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

    public Autor(){
        this.nume="";
        this.prenume="";
        this.varsta=0;
    }

    public Autor(String nume,String prenume,int varsta){
        this.varsta=varsta;
        this.nume=nume;
        this.prenume=prenume;
    }


    @Override
    public String toString() {
        return "Autor:" + "nume='" + nume + '\'' + ", prenume='" + prenume + '\'' + ", varsta=" + varsta;
    }
}
