public class Ghiozdan {

    private Rechizita[] rechizite;
    private int nr;

    public Ghiozdan(int dim) {
        rechizite = new Rechizita[dim];
        nr = 0;
    }

    public void add(Manual manual) {
        rechizite[nr++] = manual;
    }

    public void add(Caiet caiet) {
        rechizite[nr++] = caiet;
    }

    public int getNrRechizite() {
        return nr;
    }

    public int getNrManuale() {
        int k = 0;
        for (int i = 0; i < nr; i++) {
            if (rechizite[i] instanceof Manual) {
                k++;
            }
        }
        return k;
    }

    public int getNrCaiete() {
        int k= 0;
        for (int i = 0; i < nr; i++) {
            if (rechizite[i] instanceof Caiet) {
                k++;
            }
        }
        return k;
    }

    public void listItems() {
        for (int i = 0; i < nr; i++) {
            System.out.println(rechizite[i].getNume());
        }
    }

    public void listManual() {
        for (int i = 0; i < nr; i++) {
            if (rechizite[i] instanceof Manual) {
                System.out.println(rechizite[i].getNume());
            }
        }
    }

    public void listCaiet() {
        for (int i = 0; i < nr; i++) {
            if (rechizite[i] instanceof Caiet) {
                System.out.println(rechizite[i].getNume());
            }
        }
    }


}
