public class PolinomGrad2 {
    private double a,b,c;
    private double x;

    public double getA() {
        return a;
    }

    public double getB() {
        return b;
    }

    public double getC() {
        return c;
    }

    public double getX() {
        return x;
    }

    public void setA(double a) {
        this.a = a;
    }

    public void setB(double b) {
        this.b = b;
    }

    public void setC(double c) {
        this.c = c;
    }

    public void setX(double x) {
        this.x = x;
    }

    public PolinomGrad2(){
        this.a=0;
        this.b=0;
        this.c=0;
        this.x=0;
    }

    public PolinomGrad2(double a,double b,double c,double x){
        this.a=a;
        this.b=b;
        this.c=c;
        this.x=x;
    }


    public double valoare(PolinomGrad2 nr){

        double rez=0;
        if(nr.x!=0) {
            rez = nr.a + nr.b * x + (nr.c * x * x);
        }
        return  rez;
    }

    public PolinomGrad2 adunare(PolinomGrad2 nr){
      return new PolinomGrad2(nr.a+ this.a, nr.b+ this.b,nr.c+ this.c,0 );
    }

    public String toString(){
        return a+ "+"+b+"*X"+"+"+c+"*X*X";
    }
}
