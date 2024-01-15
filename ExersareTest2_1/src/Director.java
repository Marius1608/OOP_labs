public class Director extends Manager{
    private double procentBonus;

    public double getProcentBonus() {
        return procentBonus;
    }

    public Director(String nume,int salariu,int nrSubordonati,double procentBonus){
        super(nume,salariu,nrSubordonati);
        this.procentBonus=procentBonus;

    }

    @Override
    public void afiseazaDetalii() {
        super.afiseazaDetalii();
        System.out.println(getProcentBonus());

    }

    @Override
    public int CalculeazaBonus() {
        int bonus= super.CalculeazaBonus();
        return (bonus+(int)getProcentBonus());
    }
}
