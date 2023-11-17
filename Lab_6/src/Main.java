
public class Main {
    public static void main(String[] args) {

        Ghiozdan ghiozdan = new Ghiozdan(10);

        Caiet c1 = new Caiet("Studentesc");
        Caiet c2 = new Caiet("Dictando");
        Caiet c3 = new Caiet("Tip A3");
        ghiozdan.add(c1);
        ghiozdan.add(c2);
        ghiozdan.add(c3);

        Manual m1 = new Manual("De Matematica");
        Manual m2 = new Manual("Abcedar");
        Manual m3=new Manual("Fizica");
        ghiozdan.add(m1);
        ghiozdan.add(m2);
        ghiozdan.add(m3);

        System.out.println("Nr rechizite: " + ghiozdan.getNrRechizite());
        System.out.println("Nr de caiete: " + ghiozdan.getNrCaiete());
        System.out.println("Nr de manuale: " + ghiozdan.getNrManuale());
        System.out.println();

        ghiozdan.listItems();
        System.out.println();

        ghiozdan.listCaiet();
        System.out.println();

        ghiozdan.listManual();
        System.out.println();

    }
}