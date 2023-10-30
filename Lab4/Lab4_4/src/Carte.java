public class Carte {

    private String numeAutor;
    private String titlu;
    private int dataAparitie;
    private int dataInchirieri;
    private String inchiriat;


    public String getNumeAutor() {
        return numeAutor;
    }

    public String getTitlu() {
        return titlu;
    }

    public int getDataAparitie() {
        return dataAparitie;
    }

    public int getDataInchirieri() {
        return dataInchirieri;
    }

    public String isInchiriat() {
        return inchiriat;
    }


    public void setDataAparitie(int dataAparitie) {
        this.dataAparitie = dataAparitie;
    }

    public void setDataInchirieri(int dataInchirieri) {
        this.dataInchirieri = dataInchirieri;
    }

    public void setInchiriat(String inchiriat) {
        this.inchiriat = inchiriat;
    }

    public Carte(){
        this.dataAparitie=0;
        this.dataInchirieri=0;
        this.inchiriat="";
        this.numeAutor="";
        this.titlu="";
    };

    public Carte(String n,String t,int d,int d1,String i){
        this.numeAutor=n;
        this.titlu=t;
        this.dataAparitie=d;
        this.dataInchirieri=d1;
        this.inchiriat=i;

    };

    public boolean esteDisponibila() {
        return "disponibila".equalsIgnoreCase(inchiriat);
    }


    public void inchiriazaCarte() {
        if (esteDisponibila()) {
            inchiriat = "inchiriata";
            dataInchirieri = 2023;
        } else {
            System.out.println("Cartea nu este disponibilă pentru închiriere.");
        }
    }


    public void returneazaCarte() {
        if ("inchiriata".equalsIgnoreCase(inchiriat)) {
            inchiriat = "disponibila";
            dataInchirieri = 0;
        } else {
            System.out.println("Cartea nu poate fi returnată, deoarece nu este închiriată.");
        }
    }

    @Override
    public String toString() {
        return "Carte{" +
                "numeAutor='" + numeAutor + '\'' +
                ", titlu='" + titlu + '\'' +
                ", dataAparitie=" + dataAparitie +
                ", dataInchirieri=" + dataInchirieri +
                ", inchiriat='" + inchiriat + '\'' +
                '}';
    }
}
