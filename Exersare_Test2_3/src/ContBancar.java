public class ContBancar {
    private int sold;

    public int getSold() {
        return sold;
    }

    public ContBancar(){
        this.sold=0;

    }

    public ContBancar(int sold){
        this.sold=sold;

    }

    public void adauga(int suma){
        this.sold=this.sold+suma;
    }

    public void extrage(int suma) throws ExceptieFonduriInsuficiente {

        if(this.sold>=suma){
            this.sold=this.sold-suma;
        }
        else {
            throw new ExceptieFonduriInsuficiente("Nu sunt banii");
        }
    }

    @Override
    public String toString() {
        return "ContBancar{" +
                "sold=" + sold +
                '}';
    }
}
