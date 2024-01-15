
public class Main {
    public static void main(String[] args) {

        Angajat a=new Angajat("Vasile",1200);
        Manager m=new Manager("Ion",2500,56);
        Director d=new Director("George",3000,60,20);

        a.afiseazaDetalii();
        System.out.println();

        m.afiseazaDetalii();
        System.out.println();

        d.afiseazaDetalii();
        System.out.println();

        int c=m.CalculeazaBonus();
        System.out.println(c);

        int c1=d.CalculeazaBonus();
        System.out.println(c1);
    }
}