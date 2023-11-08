import java.awt.*;

public class Carte {

    private String titlu;
    private Autor autor;
    private int iD;
    private int copiiDisponibile;

    public Carte(){
        this.titlu="";
        this.autor.setNume("");
        this.autor.setPrenume("");
        this.autor.setVarsta(0);
        this.iD=0;
        this.copiiDisponibile=0;
    }

    public Carte(String titlu, Autor autor,int iD,int copiiDisponibile){
        this.titlu=titlu;
        this.autor=autor;
        this.iD=iD;
        this.copiiDisponibile=copiiDisponibile;
    }


    public String getTitlu() {
        return titlu;
    }

    public Autor getAutor() {
        return autor;
    }

    public int getiD() {
        return iD;
    }

    public int getCopiiDisponibile() {
        return copiiDisponibile;
    }




    public void setAutor(Autor autor) {
        this.autor = autor;
    }


    public void setCopiiDisponibile(int copiiDisponibile) {
        this.copiiDisponibile = copiiDisponibile;
    }


    @Override
    public String toString() {
        return "Carte:" + "titlu='" + titlu + '\'' + ", autor=" + autor + ", iD=" + iD + ", copiiDisponibile=" + copiiDisponibile;
    }
}
