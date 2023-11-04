public class NrComplex {

    private int real;
    private int img;
    public NrComplex(int real, int img){
        this.real=real;
        this.img=img;
    }

    public NrComplex adunare(NrComplex c1){
        NrComplex rezultat=new NrComplex(this.real,this.img);
        rezultat.img+= c1.img;
        rezultat.real+=c1.real;
        return rezultat;

    }

    public  NrComplex scadere(NrComplex c1){
        return new NrComplex(this.real-c1.real,this.img-c1.img);
    }

    public NrComplex inmultire(int c1){
        NrComplex rezultat=new NrComplex(this.real,this.img);
        rezultat.img = c1 * rezultat.img;
        rezultat.real = c1 * rezultat.real;
        return rezultat;

    }




    public int getReal() {
        return real;
    }

    public int getImg() {
        return img;
    }

    public void setReal(int real) {
        this.real = real;
    }

    public void setImg(int img) {
        this.img = img;
    }

    //retrun new NrComplex(this.img+c1.img,this.real+c1.real);

    @Override
    public String toString() {
        if(this.img==0) return Integer.toString(this.real);
        return this.real+" + " + this.img + "i";
    }
}
