import javax.swing.plaf.PanelUI;

public class Manager extends Angajat{
    private int numarSubordonati;

    public int getNumarSubordonati() {
        return numarSubordonati;
    }

    public Manager(){
        super();
        this.numarSubordonati=0;
    }

    public Manager(String nume,double salariu,int numarSubordonati){
        super(nume,salariu);
        this.numarSubordonati=numarSubordonati;
    }
    @Override
    public void afiseazaDetalii() {
        super.afiseazaDetalii();
        System.out.println(getNumarSubordonati());
    }

    public int CalculeazaBonus(){
        int bonus=0;
        if(this.numarSubordonati<50) bonus=this.numarSubordonati/2;
        if(this.numarSubordonati>=50) bonus=this.numarSubordonati+1;
        return bonus;
    }


}
