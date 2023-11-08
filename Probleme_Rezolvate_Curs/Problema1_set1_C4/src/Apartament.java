public class Apartament {
    private int numarApartamen;
    public Apartament(int nr){
        this.numarApartamen=nr;
    }

    public void metoda(){
        System.out.println("Metoda clasa apart");
    }

    public class Camera{
        private int numarCamnera;
        public Camera(int nr){
            this.numarCamnera=nr;
        }

        public void metoda1(){
            System.out.println("Metoda clasa camera");
            metoda();
        }

    }

}
