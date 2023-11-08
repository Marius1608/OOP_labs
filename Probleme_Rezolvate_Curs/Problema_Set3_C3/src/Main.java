import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
    Scanner s=new Scanner(System.in);
    PolinomGrad2 f=new PolinomGrad2();
    PolinomGrad2 f2=new PolinomGrad2(2,3,21,0);
    if(f2.getX()==0) System.out.println(f2);

    System.out.print("Introduceți termenul liber (coeficientul pentru x^0): ");
    double val=s.nextDouble();

    f2.setX(val);
    double rez=f2.valoare(f2);
    System.out.println(rez);
    System.out.println();

    f2.setX(0);
    PolinomGrad2 f3=new PolinomGrad2(1,2,4,0);
    System.out.println(f3);
    System.out.println();

    f=f2.adunare(f3);
    System.out.println(f);
    System.out.println();

    PolinomGrad2[] polinoame=new PolinomGrad2[3];
    polinoame[0]=new PolinomGrad2(1.1,2,1,0);
    polinoame[1]=new PolinomGrad2(12,1,1,1);
    polinoame[2]=new PolinomGrad2(1,2,1,1);


    for(int i=0; i<polinoame.length; i++){
        System.out.println("Polinom "+ i + ": "+polinoame[i]);
        }
    }


}