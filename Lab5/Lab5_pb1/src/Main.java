import static java.lang.System.arraycopy;

public class Main {
    public static void main(String[] args) {

        NrComplex a=new NrComplex(1,3);
        NrComplex b=new NrComplex(1,1);
        NrComplex c,d,e;

        c=a.adunare(b);
        System.out.println(c);

        d=b.scadere(a);
        System.out.println(d);

        e=a.inmultire(2);
        System.out.println(e);

        NrComplex[][] a1 = {
                {new NrComplex(1, 2), new NrComplex(3, 4)},
                {new NrComplex(5, 6), new NrComplex(7, 8)}
        };

        NrComplex[][] a2 = {
                {new NrComplex(1, 1), new NrComplex(2, 2)},
                {new NrComplex(3, 3), new NrComplex(4, 4)}
        };

        MatriceComplexa matrice1 = new MatriceComplexa(a1);
        MatriceComplexa matrice2 = new MatriceComplexa(a1);


        MatriceComplexa s = matrice1.adunare(matrice2);
        System.out.println("Suma matricelor:");
        s.afisareMatrice();


        MatriceComplexa di = matrice1.scadere(matrice2);
        System.out.println("Diferenta matricelor:");
        di.afisareMatrice();


        MatriceComplexa p = matrice1.inmultireCuScalar(4);
        System.out.println("Scalar:");
        p.afisareMatrice();
    }
}