
public class Main {
    public static void main(String[] args) {
        ManagerFlota managerFlota = new ManagerFlota();

        Vehicul vehicul1 = new VehiculBaza("Toyota", 2020, 25000);
        Vehicul vehicul2 = new VehiculElectric("Tesla", 2022, 80000, 400);
        Vehicul vehicul3 = new VehiculHibrid("Toyota Prius", 2021, 30000, 50, 500);

        managerFlota.adaugaVehicul(vehicul1);
        managerFlota.adaugaVehicul(vehicul2);
        managerFlota.adaugaVehicul(vehicul3);

        managerFlota.afiseazaDetaliiFlota();

        try {
            managerFlota.simuleazaOperatiuniAutonomie(vehicul2, 300);
            managerFlota.simuleazaOperatiuniAutonomie(vehicul3, 60);
        } catch (ExceptieAutonomieInsuficienta e) {
            System.out.println("Exceptie: " + e.getMessage());
        }
    }

}