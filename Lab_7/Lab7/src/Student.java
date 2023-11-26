public class Student implements Cloneable{
    private String nume;
    private String prenume;
    private Masina masina;

    public Student(String nume, String prenume, Masina masina) {
        this.nume = nume;
        this.prenume = prenume;
        this.masina = masina;
    }

    public Masina getMasina() {
        return masina;
    }

    public void setMasina(Masina masina) {
        this.masina = masina;
    }


    @Override
    public Object clone() throws CloneNotSupportedException {

        Student studentClone = (Student) super.clone();
        studentClone.masina = (Masina) masina.clone();
        return studentClone;
    }

    @Override
    public String toString() {
        return "Student: " + nume + " " + prenume + ", " + masina.toString();
    }
}
