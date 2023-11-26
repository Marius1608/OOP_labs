import java.util.Arrays;
import java.util.Comparator;

public class Main {


    public static void main(String[] args) {

        Persoana[] p=new Persoana[3];
        p[0]=new Persoana("Butunoi","Daniel",21);
        p[1]=new Persoana("Gradinaru","Ana",19);
        p[2]=new Persoana("Bocancia","Gabriel",18);


        for(int i=0; i< p.length; i++){
            System.out.println(p[i]);
        }
        System.out.println();


        Arrays.sort(p);
        for(int i=0; i< p.length; i++){
            System.out.println(p[i]);
        }
        System.out.println();


        Arrays.sort(p, Persoana.comparatortByVarsta);
        for(int i=0; i< p.length; i++){
            System.out.println(p[i]);
        }

    }
}