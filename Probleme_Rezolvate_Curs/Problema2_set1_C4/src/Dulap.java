public class Dulap {
    public void metodaComuna(){
        System.out.println("Acesta este metoda comuna: D");
    }

    public class Raft{
        public void metodaComuna(){
            System.out.println("Aceasta este metoda comuna: R");
            Dulap.this.metodaComuna();
        }

    }
}
