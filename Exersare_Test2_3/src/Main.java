
public class Main {
    public static void main(String[] args) throws ExceptieFonduriInsuficiente {

        ContBancar c1=new ContBancar(1340);
        c1.adauga(1200);
        System.out.println(c1);

        c1.extrage(100);
        System.out.println(c1);

        //c1.extrage(2800);

    }
}