import java.util.*;

public class Main {
    public static void main(String[] args) {

        Punct<Integer> p1=new Punct<Integer>(10,2);
        Punct<Float> p2=new Punct<Float>((float)2.2,(float)13.2);
        Punct<Double> p3=new Punct<Double>(2.3,12.2);

       ArrayList<Punct<Integer>> P=new ArrayList<Punct<Integer>>();
       P.add(p1);

       ArrayList<Punct<Float>> P1=new ArrayList<Punct<Float>>();
       P1.add(p2);

       ArrayList<Punct<Double>> P2=new ArrayList<Punct<Double>>();
       P2.add(p3);

       System.out.println(P1);

       double x=p2.distanta(p1);
       System.out.println(x);
    }
}