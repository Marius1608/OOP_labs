import static java.lang.Math.abs;

public class Main {
    public static void main(String[] args) {

        String str1="Ana are ";
        String str2="mere";
        String str3=str1+str2;
        System.out.println(str3=="Ana are mere");
        System.out.println(str3.equals("Ana are mere"));
        System.out.println();
        //if(abs(0.1+0.1+0.1)-0.3)<eps)

         int varsta=12,gen=1,inaltime=123;
         short wrap = 0;
         wrap=(short)(wrap | inaltime);
         wrap=(short)(wrap|(gen<<8));
         wrap=(short)(wrap|(varsta<<9));

        inaltime=wrap & 0xff;
        gen=(wrap >>> 8) & 1;
        varsta=(wrap >>> 9) & 0x7f;

        System.out.println(inaltime);
        System.out.println(gen);
        System.out.println(varsta);
        System.out.println();

        int age=27;
        switch (age)
        {
            case 18:
                System.out.println("tanar");
                break;
            case 30:
                System.out.println("adult");
            case 50:
                System.out.println("batran");
        }
        if (0.1 + 0.1 + 0.1 == 0.3) {
            System.out.println("Equals");
        }else {
            System.out.println("NU");
        }
        System.out.println();
    }
}