import java.util.Comparator;
import java.util.Arrays;
public class Persoana implements Comparable<Persoana> {
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

    public Persoana(String nume,String prenume,int varsta){
        this.nume=nume;
        this.prenume=prenume;
        this.varsta=varsta;
    }

    public static Comparator<Persoana> comparatortByVarsta = Comparator.comparingInt(o -> o.varsta);

    public int compareTo(Persoana other) {
        return this.nume.compareTo(other.nume);
    }

    @Override
    public String toString() {
        return "Persoana" + "nume='" + nume + '\'' + ", prenume='" + prenume + '\'' + ", varsta=" + varsta ;
    }
}
