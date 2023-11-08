
public class Main {
    public static void main(String[] args) {

        Dog d1=new Dog();
        System.out.println(d1);
        d1.setName("Flufy");
        d1.setSize(60);
        System.out.println(d1);

        d1.name="Pits";
        d1.size=32;
        System.out.println(d1);

        DogV2 d2=new DogV2();
        System.out.println(d2);
        d2.setName("logy");
        d2.setSize(27);
        System.out.println(d2);

        DogV3 d3=new DogV3();
        System.out.println(d3);
        d3=new DogV3(23,"BULLY");
        System.out.println(d3);
    }
}