import java.awt.*;

public class Main {
    public static void main(String[] args) {

        Autovehicul a1 = new Autovehicul();

        a1.setMarca("Audi");
        a1.setColor(Color.BLACK);
        a1.setTreaptaVitezaCurenta(0);
        a1.setViteazCurenta(100);


        System.out.println(a1);


        a1.acelerare(100);
        System.out.println(a1);
        a1.declerare(50);
        System.out.println(a1);
        System.out.println();


        a1.setTreaptaVitezaCurenta(2);
        System.out.println(a1);
        System.out.println();

        a1.oprire();
        System.out.println(a1);
        System.out.println();

        a1.setTreaptaVitezaCurenta(4);
        System.out.println(a1);
        a1.schimbareTreapta(100);
        System.out.println(a1);
        System.out.println();



        Sofer a2=new Sofer("Butunoi","Adrian",22,1621);
        System.out.println(a2);

        a1.setSofer(new Sofer("Butunoi","Adrian",22,1621));
        System.out.println(a1.getSofer());

        a1.setRez(new Rezervor(150,45));
        System.out.println(a1.getRez());

        Rezervor a4=new Rezervor(123,43);
        a4.umplere(12);
        System.out.println(a4);

        a4.golire();
        System.out.println(a4);

        a4.umplere(78);
        System.out.println(a4);

        a4.golire(50);
        System.out.println(a4);


    }
}
