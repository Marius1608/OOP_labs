import java.util.ArrayList;

public class ManagerFlota {
    private ArrayList<Vehicul> flota = new ArrayList<>();

    public void adaugaVehicul(Vehicul vehicul) {
        flota.add(vehicul);
    }

    public void stergeVehicul(Vehicul vehicul) {
        flota.remove(vehicul);
    }

    public void afiseazaDetaliiFlota() {
        for (Vehicul vehicul : flota) {
            vehicul.afiseazaDetalii();
        }
    }

    public void simuleazaOperatiuniAutonomie(Vehicul vehicul, double distanta) throws ExceptieAutonomieInsuficienta {
        if (vehicul instanceof VehiculElectric) {
            if (((VehiculElectric) vehicul).obtineAutonomie() < distanta) {
                throw new ExceptieAutonomieInsuficienta("Autonomie electrica insuficienta!");
            }
            System.out.println("Vehicul electric se deplaseaza pe o distanta de " + distanta + " km.");
        } else if (vehicul instanceof VehiculHibrid) {
            if (((VehiculHibrid) vehicul).obtineAutonomieElectric() < distanta) {
                throw new ExceptieAutonomieInsuficienta("Autonomie electrica insuficienta!");
            }
            System.out.println("Vehicul hibrid se deplaseaza pe o distanta de " + distanta + " km in mod electric.");
        } else {
            System.out.println("Vehicul se deplaseaza pe o distanta de " + distanta + " km.");
        }
    }
}
