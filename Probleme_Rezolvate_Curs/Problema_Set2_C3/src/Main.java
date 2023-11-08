import java.awt.font.NumericShaper;

public class Main {
    public static void main(String[] args) {

        NumarComplex nr=new NumarComplex(2,3);
        NumarComplex nr1=new NumarComplex(12,3);
        NumarComplex nr2;
        NumarComplex nr3=new NumarComplex();
        double m;

        System.out.println(nr);
        System.out.println(nr1);
        System.out.println();

        nr2=nr.adunare(nr1);
        System.out.println(nr2);
        System.out.println();


        m= nr3.modul(nr1);
        System.out.println(m);
        System.out.println();

        NumarComplex []numere=new NumarComplex[2];
        numere[0]=new NumarComplex(2,3);
        numere[1]=new NumarComplex(2,2);
        for(int i=0; i<numere.length; i++){
            System.out.println(numere[i]);
        }

    }
}