public class Dreapta {
    private int a;
    private int b;
    private int c;

    public Dreapta(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }

    public int getC() {
        return c;
    }

    public void setC(int c) {
        this.c = c;
    }

    @Override
    public String toString() {
        return a + "X + " + b +"Y + " + c + "= 0";
    }

    public void afiseazaParametrii() {
        System.out.println(a + "X + " + b +"Y + " + c + "= 0");
    }

    public double calculeazaDistanta(Punct p) {
        return Math.abs(a * p.getX() + b* p.getY() + c)/Math.sqrt(a*a + b*b);
    }
}
