
public class Main {
    public static void main(String[] args) {


        Masina m1 = new Masina("Audi", "Negru");
        Student s1 = new Student("Pantea", "Marius", m1);

        try {
            Student s2 = (Student) s1.clone();
            Student s3 = (Student) s1.clone();
            Student s4 = (Student) s1.clone();

            s2.getMasina().revopsire("verde");
            s3.getMasina().revopsire("alb");

            System.out.println("Student Original: " + s1);
            System.out.println(s4);
            System.out.println();
            System.out.println("Student C.Suprafata: " + s2);
            System.out.println("Student C.Profunzime: " + s3);

        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
    }
}
