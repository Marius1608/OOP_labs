import java.lang.Math;
public class NumarComplex {

    private int Real;
    private int Imag;

    public void setImag(int imag) {
        Imag = imag;
    }

    public int getImag() {
        return Imag;
    }

    public int getReal() {
        return Real;
    }

    public void setReal(int real) {
        Real = real;
    }


    @Override
    public String toString(){
        if(Real==0) return "Nr complex:"+"+"+"i*"+Imag;
        else return "Nr complex:"+Real+"+"+"i*"+Imag;
    }

    public NumarComplex(){
        this.Imag=0;
        this.Real=0;
    }

    public NumarComplex(int r,int i){
        this.Imag=i;
        this.Real=r;
    }

    public double modul(NumarComplex c){
        double a=c.Imag*c.Imag+c.Real*c.Real;
        return Math.sqrt(a);
    }

    public NumarComplex adunare(NumarComplex c){
        NumarComplex a=new NumarComplex(this.Real,this.Imag);
        a.Imag+=c.Imag;
        a.Real+=c.Real;
        return a;
    }



}


