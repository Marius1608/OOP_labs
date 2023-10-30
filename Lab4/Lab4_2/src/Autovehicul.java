import java.awt.*;

public class Autovehicul {
    private String marca;
    private Color color;
    private float viteazCurenta;
    private int treaptaVitezaCurenta;
    private float vitezaMaxima;
    private int numarTrepte;

   private Sofer sofer;
   private Rezervor rez;

    public Rezervor getRez() {
        return rez;
    }

    public void setRez(Rezervor rez) {
        this.rez = rez;
    }

    public Sofer getSofer() {
        return sofer;
    }

    public void setSofer(Sofer sofer) {
        this.sofer = sofer;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String m) {
        marca = m;
    }

    public float getViteazCurenta() {
        return viteazCurenta;
    }

    public void setViteazCurenta(float viteazCurenta) {
        this.viteazCurenta = viteazCurenta;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public int getTreaptaVitezaCurenta() {
        return treaptaVitezaCurenta;
    }

    public void setTreaptaVitezaCurenta(int treaptaVitezaCurenta) {
        this.treaptaVitezaCurenta = treaptaVitezaCurenta;
    }

    public Autovehicul() {
        this.treaptaVitezaCurenta = 0;
        this.viteazCurenta = 0;
        this.vitezaMaxima = 260;
        this.marca = "";
        this.color = Color.WHITE;
        this.numarTrepte=7;


    }

    public Autovehicul(String m, Color c, float v) {
        marca = m;
        color = c;
        vitezaMaxima = v;
    }

    void acelerare(float delta) {
        if (delta + viteazCurenta <= vitezaMaxima) {
            viteazCurenta += delta;
        } else {
            this.viteazCurenta = this.vitezaMaxima;
        }
    }

    void declerare(float delta) {
        if (this.viteazCurenta - delta >= 0) {
            viteazCurenta -= delta;
        } else {
            viteazCurenta = 0;
        }

    }

    void oprire() {
        this.treaptaVitezaCurenta = 0;
        this.viteazCurenta = 0;
    }

    void schimbareTreapta(float delta) {
        if (this.viteazCurenta + delta <= vitezaMaxima && treaptaVitezaCurenta<numarTrepte) {
            treaptaVitezaCurenta++;
        }

    }

    @Override
    public String toString() {
        return "Autovehicul{" +
                "marca='" + marca + '\'' +
                ", color=" + color +
                ", viteazCurenta=" + viteazCurenta +
                ", treaptaVitezaCurenta=" + treaptaVitezaCurenta +
                ", vitezaMaxima=" + vitezaMaxima +
                ", numarTrepte=" + numarTrepte +
                '}';
    }


}
