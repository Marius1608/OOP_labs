
public class Main {
    public static void main(String[] args) {

        PerecheInt p1=new PerecheInt(10,5);
        System.out.println(p1);
        PerecheString p2=new PerecheString("ABC","DE");
        System.out.println(p2);

        Pereche<Integer> p3=new Pereche<Integer>(10,5);
        System.out.println(p3);
        Pereche<String> p4=new Pereche<String>("ABC","DE");
        System.out.println(p4);

        p4.afisareDuala("OOP");
        p3.afisareDuala(10);

        p4.afisareCuPereche(p4);
        p4.afisareCuPereche(p3);

        //p4.afisareCuPereche("ABC"); nu merge
        //Pereche2<String> p5=new Pereche2<String>("ABC","DE");
        //System.out.println(p5);

        Pereche<Number> num1=new Pereche<>(10,5);
        Pereche<Integer>num2=new Pereche<>(10,3);
        Pereche<String> num3=new Pereche<>("ABC","XYZ");

        m1(num1);
        // m1(num2); nu merge

        m2(num1);
        m2(num2);
        //m2(num3); eroare de compilare


    }

    public static void m1(Pereche<Number> num){
        System.out.println(num);
    }
    public static <T extends Number> void m2(Pereche<T>num){
        System.out.println(num);
    }

}